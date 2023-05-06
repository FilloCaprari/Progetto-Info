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
public class Opzione{
    
    private String opzione1;
    private boolean giusta;

    public Opzione(String opz1, boolean g) {
        this.opzione1 = opz1;
        this.giusta = g;
    }

    public String getOpzione1() {
        return opzione1;
    }

    public void setGiusta() {
        this.giusta = true;
    }

    
    
}
