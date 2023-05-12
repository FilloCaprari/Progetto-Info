package Tester;


import Control.GestoreDomande;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import model.Domanda;
import model.Opzione;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author senafej
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        GestoreDomande g = new GestoreDomande(); //testiamo il gestore
        
        g.Gioca(); //inizio del gioco
    }
    
}
