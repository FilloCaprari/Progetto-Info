package Tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author senafej
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("Domande.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String[] info = line.split(","); 
            System.out.println(info[0]);
            System.out.println(info[1]);
            System.out.println(info[2]);
            System.out.println(info[3]);
            System.out.println(info[4]);
            System.out.println(info[5]);
            System.out.println(info[6]);
        }
    }
    
}
