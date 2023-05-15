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
    
    public AiutoDaCasa(Domanda d) {
        super(d);
        this.d = d;
    }
    
}
