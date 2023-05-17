package Tester;


import Control.GestoreDomande;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import model.AiutoGiaUsatoException;
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
    public static void main(String[] args) throws IOException, AiutoGiaUsatoException{
        Scanner scanner = new Scanner(System.in);
        String scelta;
       do{
       GestoreDomande g = new GestoreDomande(); //testiamo il gestore
        
       System.out.println("");
       if(g.Gioca()){//inizio del gioco
           System.out.println("SEI DIVENTATO MILIONARIO!");
       }
       else{
           System.out.println("RITENTA, SARAI PIU' FORTUNATO!");
       }
       
       System.out.print("Ci stai simpatico, vuoi rigiocare(s/n)?");
       System.out.println("");
       System.out.println("");
       scelta = scanner.nextLine();
       }while(scelta.charAt(0) == 's'); //se l'utente preme s, rigiocherà, se invece preme qualsiasi altro carattere/pulsante, il programma si arresterà
        
      
    }
}
