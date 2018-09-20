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

            String datatype;
            while (sc.hasNext() && nonerror == 1) {
                datatype = sc.nextLine();
                String[] u = datatype.split(" ");

                System.out.print(datatype);
                if (!datatype.isEmpty()) {
                    nonerror = r.endStatement(datatype);
                }
                for (int i = 0; i < u.length; i++) {
                    int p = r.isDataType(u);
                    
                }
                System.out.println();
            }
            
            if (nonerror == 1) {
                System.out.println("program runs");
            } else {
                System.out.println("program does not run");
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }

    }

}
