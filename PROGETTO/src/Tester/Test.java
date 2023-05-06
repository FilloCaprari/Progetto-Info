package Tester;


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
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("Domande.csv"));
        String line;
        String[] etichette =br.readLine().split(",");
        ArrayList<Domanda> lista = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String[] info = line.split(",");
            Opzione o1=new Opzione(info[2],false);
            Opzione o2=new Opzione(info[3],false);
            Opzione o3=new Opzione(info[4],false);
            Opzione o4=new Opzione(info[5],false);
            Domanda d =new Domanda(info[0],info[1],o1,o2,o3,o4,parseInt(info[6]));
            lista.add(d);
        }

        for(Domanda x: lista)
        {
            System.out.println(x.getId());
            System.out.println(x.getTesto());
            System.out.println(x.getA());
            System.out.println(x.getB());
            System.out.println(x.getC());
            System.out.println(x.getD());
        }
    }
    
}
