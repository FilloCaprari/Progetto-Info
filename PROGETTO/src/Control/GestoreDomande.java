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
import model.Aiuto;
import model.AiutoDaCasa;
import model.AiutoGiaUsatoException;
import model.AiutoJerry;
import model.AiutoPubblico;
import model.CinquantaECinquanta;
import model.Premio;

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
    private ArrayList<Double> aiutoPubb = new ArrayList<>();
    private ArrayList<Opzione> cinq = new ArrayList<>();

    
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
            intArray.add(i); //carichiamo intArray con i numeri da 0 a 99
        }
        this.domandeScelte.clear(); //svuotiamo l'array per errori di refusi di memoria
		
        shuffle(intArray); //"mescoliamo" l'array
        
       for(int i=0; i<15; i++){ //carichiamo domandeScelte con i primi 15 numeri di intArray, corrispondenti a 15 domande sparse in lista
          Domanda d = lista.get(intArray.get(i).intValue());
          this.domandeScelte.add(d);
       }
    }
    
    public void Gioca() throws IOException, AiutoGiaUsatoException{ //inizia il divertimento!
        Scanner scanner = new Scanner(System.in);
        
        lettura(); //leggiamo il file
        scegliDomande();//scegliamo le domande
        Premio p =new Premio();
        
        AiutoJerry aiuto1 = new AiutoJerry();
        AiutoPubblico aiuto2 = new AiutoPubblico();
        CinquantaECinquanta aiuto3 = new CinquantaECinquanta();
        AiutoDaCasa aiuto4 = new AiutoDaCasa();


        int i=0;
        while(i<15){ //while utilizzato per fare solo 15 domande
            
            String scelta=" ";
            
            //output della domanda e edelle opzioni di risposta
            System.out.println(this.domandeScelte.get(i).getTesto());
            System.out.println("a: " + this.domandeScelte.get(i).getOpz1().getOpzione1());
            System.out.println("b: " + this.domandeScelte.get(i).getOpz2().getOpzione1());
            System.out.println("c: " + this.domandeScelte.get(i).getOpz3().getOpzione1());
            System.out.println("d: " + this.domandeScelte.get(i).getOpz4().getOpzione1());
            
            
            do{ //do-while per far ripetere la scelta se è stato digitato un valore invalido
                System.out.print("Scelta(a,b,c,d):");
                System.out.print("Aiuti(1:Aiuto di Jerry, 2:Aiuto dal pubblico, 3:50/50, 4:Aiuto da Casa):");
                scelta = scanner.nextLine(); //input della risposta dell'utente
            }while(scelta.charAt(0) != 'a' && scelta.charAt(0) != 'b' && scelta.charAt(0) != 'c' && scelta.charAt(0) != 'd' && scelta.charAt(0) != '1' && scelta.charAt(0) != '2' && scelta.charAt(0) != '3' && scelta.charAt(0) != '4');
            
            
         if(scelta.charAt(0)=='1' || scelta.charAt(0)=='2' ||scelta.charAt(0)=='3' ||scelta.charAt(0)=='4')
         {
             
            do{    
             
             try{  
                if(scelta.charAt(0)=='1')
                {
                          System.out.println("JERRY: Secondo me la risposta corretta è "+ aiuto1.Jerry(domandeScelte.get(i)).getOpzione1());       
                }
                else if(scelta.charAt(0)=='2')
                {
                           aiutoPubb=aiuto2.Pubblico(domandeScelte.get(i));
                           System.out.println("a:" + aiutoPubb.get(0) +"%");
                           System.out.println("b:" + aiutoPubb.get(1) +"%");
                           System.out.println("c:" + aiutoPubb.get(2) +"%");
                           System.out.println("d:" + aiutoPubb.get(3) +"%");
                }

                else if(scelta.charAt(0)=='3')
                {
                           cinq=aiuto3.cinquanta(domandeScelte.get(i));
                           System.out.println(cinq.get(0).getOpzione1());
                           System.out.println(cinq.get(1).getOpzione1());           
                }
                else if(scelta.charAt(0)=='4')
                {  
                   System.out.println("NONNA ROSANNA: Secondo me la risposta è " + aiuto4.AiutoDaCasa(domandeScelte.get(i)).getOpzione1());
                }

                do{
                    scelta = scanner.nextLine();
                }while(scelta.charAt(0) != 'a' && scelta.charAt(0) != 'b' && scelta.charAt(0) != 'c' && scelta.charAt(0) != 'd' && scelta.charAt(0) != '1'&& scelta.charAt(0) != '2'&& scelta.charAt(0) != '3'&& scelta.charAt(0) != '4');
            }
            catch(AiutoGiaUsatoException ex)
            {
                ex.getMessage();
                do{
                     scelta = scanner.nextLine();
                }while(scelta.charAt(0) != 'a' && scelta.charAt(0) != 'b' && scelta.charAt(0) != 'c' && scelta.charAt(0) != 'd'&& scelta.charAt(0) != '1'&& scelta.charAt(0) != '2'&& scelta.charAt(0) != '3'&& scelta.charAt(0) != '4');   
            }
       }while(scelta.charAt(0) == '1' || scelta.charAt(0) == '2' || scelta.charAt(0) == '3' || scelta.charAt(0) == '4');
          
     }
         
         if(scelta.charAt(0) == this.domandeScelte.get(i).rispostaGiusta())//controllo se la risposta dell'utente è giusta
                    {
                        System.out.println("RISPOSTA CORRETTA!");
                        p.aggiornaVincita();
                        System.out.println(p.getVincita()+"$");
                    }
                    else
                    {
                        System.out.println("RISPOSTA SBAGLIATA! HAI PERSO!");
                        System.out.println("LA RISPOSTA ERA LA LETTERA: " + this.domandeScelte.get(i).rispostaGiusta());
                        i=16;
                    }
                    i++; //aumento contatore utilizzato nel while
    }
  }
        
 }
