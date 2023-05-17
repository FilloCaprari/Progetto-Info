package Tester;


import Control.GestoreDomande;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import model.AiutoPubblico;
import model.CinquantaECinquanta;
import model.Domanda;
import model.Opzione;
import model.Premio;

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
        
       // GestoreDomande g = new GestoreDomande(); //testiamo il gestore
        
        
        //test per classe AiutoPubblico
        Opzione a = new Opzione("SBAGLIATA1", false);
        Opzione b = new Opzione("SBAGLIATA2", false);
        Opzione c = new Opzione("SBAGLIATA3", false);
        Opzione z = new Opzione("GIUSTA", true);
        Domanda d = new Domanda("1", "ciao", a, b, c, z, 4);
        CinquantaECinquanta aiuto = new CinquantaECinquanta(d);
        for(int i=0;i<2;i++)
        {
            System.out.println(aiuto.cinquanta().get(i).getOpzione1());

        }
       
        
        
        
        //g.Gioca(); //inizio del gioco
    }
    
}
