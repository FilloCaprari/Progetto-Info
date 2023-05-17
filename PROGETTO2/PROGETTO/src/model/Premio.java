/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jacoposenafe
 */
public class Premio {

    
    
    private int vincita;
    private int numDomanda=0;

    public Premio() {
        
    }

    
    
    public int aggiornaVincita()
    {
        this.numDomanda++;
        
        if(numDomanda<=3)
        {
            this.vincita=vincita+100;
        }
        if(numDomanda==4)
        {
            this.vincita=vincita+200;
        }
        if(numDomanda>=5 && numDomanda<=11)
        {
            this.vincita=vincita*2;
        }
        if(numDomanda==12)
        {
            this.vincita=vincita+61000;
        }
        if(numDomanda>12)
        {
            this.vincita=vincita*2;
        }
        
        return 0;
    }

    public int getVincita() {
        return vincita;
    }
    
    
}


