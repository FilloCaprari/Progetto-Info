/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caprarif
 */
public class AiutoDaCasa extends Aiuto{
    
    private Domanda d;
    private int scelta;

    
    public AiutoDaCasa(Domanda d) {
        super(d);
        this.d = d;
        setScelta(this.scelta);
    }
    
    public Opzione AiutoDaCasa() throws AiutoGiaUsatoException{
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
