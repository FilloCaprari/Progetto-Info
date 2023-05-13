/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author senafej
 */
public class Opzione{ //classe usata per le opzioni
    
    private String opzione1; //testo dell'opzione
    private boolean giusta; //boolean che dichiara se l'opzione è giusta

    public Opzione(String opz1, boolean g) { //costrtuttore
        this.opzione1 = opz1;
        this.giusta = g;
    }

    public String getOpzione1() {
        return opzione1; //getter
    }

    public void setGiusta() {
        this.giusta = true;
    }

    public boolean isGiusta() {
        return giusta;
    } 
}
