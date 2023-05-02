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
public class Domanda {
    
    private String id, testo;
    private Opzione a,b,c,d;
    private int corretta;
    
    public Domanda(String ID, String t, Opzione a, Opzione b, Opzione c, Opzione d, int corr)
    {
        this.id=ID;
        this.testo=t;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.corretta=corr;
        
    }

    public String getId() {
        return id;
    }

    public String getTesto() {
        return testo;
    }
    
    public void Giusta()
    {
        if(corretta==1)a.setGiusta();
        if(corretta==2)b.setGiusta();
        if(corretta==3)c.setGiusta();
        if(corretta==4)d.setGiusta();
    }
   
    
}
