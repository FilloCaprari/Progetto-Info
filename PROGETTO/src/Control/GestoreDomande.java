/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
        br = new BufferedReader(new FileReader("Domande.csv"));
        br.readLine();
        while ((this.line = br.readLine()) != null) {

                String[] info = this.line.split(",");
                Opzione o1=new Opzione(info[2],false);
                Opzione o2=new Opzione(info[3],false);
                Opzione o3=new Opzione(info[4],false);
                Opzione o4=new Opzione(info[5],false);
                Domanda d =new Domanda(info[0],info[1],o1,o2,o3,o4,parseInt(info[6]));
                lista.add(d);
            }
       br.close();
    }
    
    public ArrayList scegliDomande()
    {
        for(int i=0;i<100;i++)
        {
            intArray.set(i, i);
        }
        this.domandeScelte.clear();
		
        shuffle(intArray);
        
       for(int i=0; i<15; i++){
          Domanda d = lista.get(intArray.get(i).intValue());
          this.domandeScelte.add(d);
       }
        return domandeScelte;
    }
        
}
