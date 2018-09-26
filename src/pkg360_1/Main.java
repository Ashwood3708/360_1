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
                
                String[] u = datatype.split(" ");

                if (r.openStatement(u[0]) == 1) {  
                    nonerror = r.isStructure(u,1);
                }else if (u[1].equals("=")){
                    nonerror = r.isStructure(u, 0);
                } else {
                    r.setErrorMsg("wrong begining notation");
                    nonerror = 0;
                }

                if (r.endStatement(datatype) == 0) {
                    r.setErrorMsg("wrong ending notation");
                    nonerror = 0;
                }
                //System.out.println();
            }

            System.out.println();

            if (nonerror == 1) {
                System.out.println("program runs");
                r.print();
            } else if(nonerror == 0){
                System.out.println("program does not run ");
                System.out.println("error: " + r.getErrorMsg());
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }

    }

}
