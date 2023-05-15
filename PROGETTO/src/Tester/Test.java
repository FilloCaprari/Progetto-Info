package Tester;


import Control.GestoreDomande;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import model.AiutoPubblico;
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
        ArrayList<Double> lista = new ArrayList();
        Opzione a = new Opzione("jkssjk", true);
        Opzione b = new Opzione("aaaaa", true);
        Opzione c = new Opzione("jksssssjk", true);
        Opzione z = new Opzione("dffdfdfd", true);
        Domanda d = new Domanda("1", "ciao", a, b, c, z, 3);
        AiutoPubblico aiuto = new AiutoPubblico(d);
        lista = aiuto.Pubblico();
        for(int i = 0; i<4; i++){
            System.out.println(lista.get(i));
        }
        
        
        
        //g.Gioca(); //inizio del gioco
    }
    
}
