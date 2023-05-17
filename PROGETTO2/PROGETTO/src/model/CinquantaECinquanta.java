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
public class CinquantaECinquanta extends Aiuto{
    
    private Domanda d;
    private ArrayList<Opzione> lista;

    public CinquantaECinquanta(Domanda d) {
        super(d);
        this.d = d;
        this.lista = new ArrayList();
        setLista();
    }

    

    public ArrayList<Opzione> cinquanta()
    {
        setUsato();
        return this.lista;
    }
    
    public void setLista()//Riempio l'array con le opzioni sbagliate
    {
        int n=0;
        int x=4;
        
        for(int i=0;i<4;i++)
        {
            lista.add(d.getOpzioni().get(i));
        }
        
        while(lista.size()!=2){
            n = (int) Math.floor(Math.random()* x);
            if(lista.get(n).isGiusta()!=true)
            {
                lista.remove(n);
                x--;
            }
        }
        
        
        
    }
    
    @Override
    public boolean isUsato() {
        return usato;
    }

    public void setUsato() {
        this.usato = true;
    }
    
    
}
