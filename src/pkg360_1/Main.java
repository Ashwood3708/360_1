/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360_1;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Abdul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operations r = new operations();

        try {

            File file = new File("360_txt.txt");
            Scanner sc = new Scanner(file);
            int nonerror = 1;

            String datatype = sc.nextLine();
            while (sc.hasNext() && nonerror == 1) {
                datatype = sc.nextLine();
                //System.out.print(datatype);
                String[] u = datatype.split(" ");
                
                if (r.openStatement(u[0]) == 1) {
                    for (int i = 1; i < u.length; i++) {
                        //nonerror = r.isVariable(u[i]);
                    }
                } else {
                    nonerror = 0;
                }

                if (r.endStatement(datatype) == 0) {
                    nonerror = 0;
                }
                //System.out.println();
            }

            System.out.println();

            if (nonerror == 1) {
                System.out.println("program runs");
                for (int i = 0; i < r.lexemes.size(); i++) {
                    System.out.println(r.lexemes.get(i));
                }
            } else {
                System.out.println("program does not run 1");
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }

    }

}
