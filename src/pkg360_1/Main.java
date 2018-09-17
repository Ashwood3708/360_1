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
    ArrayList<String> lexemes = new ArrayList<String>();
    ArrayList<String> tokens = new ArrayList<String>();

    public static void main(String[] args) {
        // TODO code application logic here
        Main r = new Main();

        try {

            File file = new File("360_txt.txt");
            Scanner sc = new Scanner(file);

            String datatype = sc.nextLine();
            while (sc.hasNext()) {
                datatype = sc.nextLine();
                int t = r.isDataType(datatype);

                //System.out.println(datatype);
            }

        } catch (Exception e) {
            System.out.println("error");
        }

    }

    public void isVariable(String x) {
        if (x.equals("double") || x.equals("int") || x.equals("char")
                || x.equals("String") || x.equals("float") || x.equals("long")) {
            System.out.print("<ident> ");
        } else {
            System.out.print("<var> ");
        }
    }

    public int isDataType(String x) {
        int n = 0;
        String[] u = x.split(" ");
        for (int i = 0; i < u.length; i++) {
            System.out.println(u[i]);
        }
       /* for (int i = 0; i < u.length; i++) {
            if (u[i].contains("float")) {
                System.out.print("<ident> ");
                i++;
                isVariable(u[i]);
            }
        }*/

        if (x.contains(
                "double")) {
            lexemes.add("double");
            n++;
        }

        if (x.contains(
                "int")) {
            lexemes.add("int");
            n++;
        }

        if (x.contains(
                "char")) {
            lexemes.add("char");
            n++;
        }

        if (x.contains(
                "string")) {
            lexemes.add("String");
            n++;
        }

        if (x.contains(
                "float")) {
            lexemes.add("float");
            n++;
        }

        if (x.contains(
                "long")) {
            lexemes.add("long");
            n++;
        }

        if (n > 1) {
            JOptionPane.showMessageDialog(null, "will not run 001");
        }

        return n;
    }

}

