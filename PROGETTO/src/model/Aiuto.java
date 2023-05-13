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
    
    private String nome;
    private boolean usato;

    public Aiuto(String nome, boolean usato) {
        this.nome=nome;
        this.usato=usato;
    }
    
    public void AiutoDacasa()
    {
      System.out.println("");
    }

    public boolean isUsato() {
        return usato;
    }
    
    
}
