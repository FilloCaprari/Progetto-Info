/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Domanda;
import model.Opzione;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author senafej
 */
public class GestoreDomande{
    
    BufferedReader br = new BufferedReader(new FileReader("Domande.csv"));
    private String line;
    private int ConteggioDomanda=0;
    private final String[] etichette =br.readLine().split(",");
    private ArrayList<Domanda> lista = new ArrayList<>(); //Array di tutte e 100 le domande
    private ArrayList<Domanda> domandeScelte = new ArrayList<>();
    private Array<int> array= new Array<>();
    
    public GestoreDomande(){
    }
    
    
    public void lettura() throws IOException{
        while ((this.line = br.readLine()) != null) {

                String[] info = this.line.split(",");
                Opzione o1=new Opzione(info[2],false);
                Opzione o2=new Opzione(info[3],false);
                Opzione o3=new Opzione(info[4],false);
                Opzione o4=new Opzione(info[5],false);
                Domanda d =new Domanda(info[0],info[1],o1,o2,o3,o4,parseInt(info[6]));
                lista.add(d);
            }
    }
    
    public ArrayList scegliDomande()
    {
        for(int i=0;i<100;i++)
        {
            intArray[i]=i+1;
        }
        
		
       while(ConteggioDomanda!=15)
        {
            ConteggioDomanda++;
            Collections.shuffle(intList);
            array.toArray(array);
        }
        return domandeScelte;
    }
        
}
