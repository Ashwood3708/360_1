/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360_1;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Abdul
 */
public class operations {

    ArrayList<String> lexemes = new ArrayList<String>();
    ArrayList<String> tokens = new ArrayList<String>();

    public int openStatement(String x) {

        if (x.equals(
                "double")) {
            lexemes.add(x);
            tokens.add("data Type");
            return 1;
        }

        if (x.equals(
                "int")) {
            lexemes.add(x);
            tokens.add("data Type");
            return 1;
        }

        if (x.equals(
                "char")) {
            lexemes.add(x);
            tokens.add("data Type");
            return 1;
        }

        if (x.equals(
                "String")) {
            lexemes.add(x);
            tokens.add("data Type");
            return 1;
        }

        if (x.equals(
                "float")) {
            lexemes.add(x);
            tokens.add("data Type");

            return 1;
        }

        if (x.equals(
                "long")) {
            lexemes.add(x);
            tokens.add("data Type");
            return 1;
        }

        // if n=1 then there is a datatype
        //if n =0 then there is variable
        return 0;

    }

    // this function takes in a string and checks the last character of the string to see if statements and methods are properly closed
    int endStatement(String theStr) {
        if (theStr.equals("") || theStr.equals(" ")) {
            //System.out.print(" YES ");
            return 1;
        } else {
            char last = theStr.charAt(theStr.length() - 1);
            // if statement that determines if statement has ended properly
            if (last == ';' || last == '{' || last == '}') {
                //System.out.print(" YES ");
                return 1;
            } else {
               // System.out.print(" NO ");
                return 0;
            }
        }

    }

    int isVariable(String h) {
        try {
            if (h.contains("(")) {
                String[] g = h.split("(");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains(",")) {
                String[] g = h.split(",");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains("*")) {
                String[] g = h.split("*");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains("=")) {
                String[] g = h.split("=");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains("+")) {
                String[] g = h.split("+");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains("-")) {
                String[] g = h.split("-");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains("/")) {
                String[] g = h.split("/");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }
            if (h.contains(")")) {
                String[] g = h.split(")");
                int p = openStatement(g[0]);
                if (p == 0) {
                    return 1;
                }
            }

        } catch (Exception e) {
            System.out.println("program will not run 2");
        }
        return 0;
    }

}
