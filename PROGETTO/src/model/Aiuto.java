/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jacoposenafe
 */
public abstract class Aiuto {
    
    protected boolean usato;

    public Aiuto() {
        this.usato=usato;
    }
    
    public Opzione Aiuto()
    {
        System.out.println("");
        return null;
    }

    public boolean isUsato() {
        return usato;
    }

    public void setUsato(boolean usato) {
        this.usato = true;
    }
}
