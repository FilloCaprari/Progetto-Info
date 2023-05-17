/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jacoposenafe
 */
public class AiutoPubblico extends Aiuto {
    
    private Domanda d;
    private boolean usato=false;

    private ArrayList<Double> percentuali;
    
    public AiutoPubblico() {
        super();
        this.percentuali = new ArrayList();
        setPercentuali();
    }
    
    public ArrayList<Double> Pubblico(Domanda d) throws AiutoGiaUsatoException{
        if(!this.usato)
        {
            setUsato();
            return this.percentuali;
        }
        else throw new AiutoGiaUsatoException();
            
        
    }
    
    @Override
    public boolean isUsato() {
        return usato;
    }

    public void setUsato() {
        this.usato = true;
    }

    public void setPercentuali() { //settiamo randomicamente le 4 percentuali che l'utente vedrà sullo schermo
        double somma = 0;
        double n;
        
        for(int i = 0; i<4; i++){ //carichiamo percentuali con 4 numeri random da 1 a 10
            n = Math.floor(Math.random()* 10)+1;
            somma += n; //teniamo conto della somma, che ci servirà in seguito
            this.percentuali.add(n);
        }
        
        double som = 0; //variabile utilizzata per controllare che la somma delle percentuali non sia <100
        for(int i = 0; i<4; i++){ 
            n = Math.floor(this.percentuali.get(i)/somma*100); //"trasformiamo" i 4 numeri randomici in percentuale, usando la somma come divisore
            som += n;
            this.percentuali.set(i, n);
        }
        
        if(som < 100) { //se per arrotondamento la somma delle percentuali è <100, aggiungiamo il valore mancante per arrivare a 100 all'ultimo elemento dell'arraylist
            this.percentuali.set(3, this.percentuali.get(3)+(100-som));
        }
    }
    
    
}
