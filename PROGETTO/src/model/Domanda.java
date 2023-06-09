/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author senafej
 */
public class Domanda {
    
    //variabili utilizzate
    private String id, testo;
    private ArrayList<Opzione> opzioni;
    private int corretta;
    
    //costruttore
    public Domanda(String ID, String t, Opzione a, Opzione b, Opzione c, Opzione d, int corr)
    {
        this.id=ID;
        this.testo=t;
        this.opzioni = new ArrayList<>();
        opzioni.add(a);
        opzioni.add(b);
        opzioni.add(c);
        opzioni.add(d);
        this.corretta=corr;
        Giusta();
    }

    //getter di tutti parametri
    public String getId() {
        return id;
    }

    public String getTesto() {
        return testo;
    }

    public Opzione getOpz1() {
        return opzioni.get(0);
    }
    public Opzione getOpz2() {
        return opzioni.get(1);
    }
    public Opzione getOpz3() {
        return opzioni.get(2);
    }
    public Opzione getOpz4() {
        return opzioni.get(3);
    }
    
    //metodo per settare l'opzione giusta
    public void Giusta()
    {
       if(this.corretta == 1)opzioni.get(0).setGiusta();
       if(this.corretta == 2)opzioni.get(1).setGiusta();
       if(this.corretta == 3)opzioni.get(2).setGiusta();
       if(this.corretta == 4)opzioni.get(3).setGiusta();
    }

    public char rispostaGiusta() {
       if(opzioni.get(0).isGiusta()==true)return 'a';
       if(opzioni.get(1).isGiusta()==true)return 'b';
       if(opzioni.get(2).isGiusta()==true)return 'c';
       if(opzioni.get(3).isGiusta()==true)return 'd';
       return 0;
    }

    public ArrayList<Opzione> getOpzioni() {
        return opzioni;
    }
}
