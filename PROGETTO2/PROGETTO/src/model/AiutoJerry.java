/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jacoposenafe
 */
public class AiutoJerry extends Aiuto {
    
    private Domanda d;
    private int scelta;
    
    public AiutoJerry(Domanda d) {
        super(d);
        this.d = d;
        setScelta(this.scelta);
    }
    
     public Opzione Jerry() throws AiutoGiaUsatoException{
        if(!this.usato){//controlliamo se l'aiuto è gia stato usato oppure no
            setUsato(); //settiamo la variabile usato a true, in modo da non far utilizzare due volte lo stesso aiuto
            return (this.d.getOpzioni().get(this.scelta));
        }
        else throw new AiutoGiaUsatoException();
        
    }

    @Override
    public boolean isUsato() {
        return this.usato;
    }

    public void setUsato() {
        this.usato = true;
    }

    private void setScelta(int scelta) { //prendiamo un numero casuale da 0 a 3, esso sarà la scelta che jerry suggerirà all'utente
        this.scelta = (int) Math.floor(Math.random()* 4);
    }
}
