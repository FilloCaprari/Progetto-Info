/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

//librerie utilizzate
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Domanda;
import model.Opzione;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author senafej
 */
public class GestoreDomande{
    
    //variabili
    private String line;
    private ArrayList<Domanda> lista = new ArrayList<>(); //Array di tutte e 100 le domande
    private ArrayList<Domanda> domandeScelte = new ArrayList<>(); //array caricato dopo scegliDomande(), contenente le 15 domande scelte che saranno chieste
    private List<Integer> intArray = new ArrayList(); //array degli id di tutte e 100 le domande
    
    public GestoreDomande(){ //costruttore vuoto
        
    }
    
    public void lettura() throws IOException{ //leggiamo il file
        BufferedReader br; //file
        br = new BufferedReader(new FileReader("Domande.csv")); //apriamo il file
        br.readLine(); //leggiamo la prima riga, che non ci serve, dove ci sono le etichette
        while ((this.line = br.readLine()) != null) { //lettura domande
                String[] info = this.line.split(",");
                Opzione o1=new Opzione(info[2],false);
                Opzione o2=new Opzione(info[3],false);
                Opzione o3=new Opzione(info[4],false);
                Opzione o4=new Opzione(info[5],false);
                Domanda d =new Domanda(info[0],info[1],o1,o2,o3,o4,parseInt(info[6]));
                lista.add(d); //incrementiamo la lista delle domande
            }
       br.close();//chiudiamo il file
    }
    
    public void scegliDomande() //scegliamo le 15 domande con lo shuffle di intArray e prendendo i prikmi 15 numeri.
    {
        for(int i=0;i<100;i++)
        {
            intArray.set(i, i); //carichiamo intArray con i numeri da 0 a 99
        }
        this.domandeScelte.clear(); //svuotiamo l'array per errori di refusi di memoria
		
        shuffle(intArray); //"mescoliamo" l'array
        
       for(int i=0; i<15; i++){ //carichiamo domandeScelte con i primi 15 numeri di intArray, corrispondenti a 15 domande sparse in lista
          Domanda d = lista.get(intArray.get(i).intValue());
          this.domandeScelte.add(d);
       }
    }
    
    public void Gioca() throws IOException{ //inizia il divertimento!
        Scanner scanner = new Scanner(System.in);
        
        lettura(); //leggiamo il file
        scegliDomande();//scegliamo le domande
        
        int i=0;
        while(i<15){ //while utilizzato per fare solo 15 domande
            
            //output della domanda e edelle opzioni di risposta
            System.out.print(this.domandeScelte.get(i).getTesto());
            System.out.println(this.domandeScelte.get(i).getA());
            System.out.println(this.domandeScelte.get(i).getB());
            System.out.println(this.domandeScelte.get(i).getC());
            System.out.println(this.domandeScelte.get(i).getD());
            String scelta;
            
            do{ //do-while per far ripetere la scelta se è stato digitato un valore invalido
                System.out.print("Scelta(A,B,C,D):");
                scelta = scanner.nextLine(); //input della risposta dell'utente
            }while(scelta.charAt(0) != 'A' || scelta.charAt(0) != 'B' || scelta.charAt(0) != 'C' || scelta.charAt(0) != 'D');
            
            //non so come controllare se la ripsota è giusta,visto che la correttezza è nella classe opzione e qui ne ho 4 e dovrei prendere quella corrrispondente alla scelta dell'utente, ma non so come si fa
            //if(scelta == this.domandeScelte.get(i).)//controllo se la risposta dell'utente è giusta
            
            i++; //aumento contatore utilizzato nel while
        }
    }
        
}
