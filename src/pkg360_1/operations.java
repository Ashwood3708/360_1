/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360_1;

import java.util.*;

/**
 *
 * @author Abdul
 */
public class operations {

    ArrayList<String> lexemes = new ArrayList<String>();
    ArrayList<String> tokens = new ArrayList<String>();

    public int isDataType(String[] p) {
        int n = 0;
        String x = p[0];

        if (x.equalsIgnoreCase(
                "double")) {
            lexemes.add("double");
            n++;
        }

        if (x.equalsIgnoreCase(
                "int")) {
            lexemes.add("int");
            n++;
        }

        if (x.equalsIgnoreCase(
                "char")) {
            lexemes.add("char");
            n++;
        }

        if (x.equalsIgnoreCase(
                "string")) {
            lexemes.add("String");
            n++;
        }

        if (x.equalsIgnoreCase(
                "float")) {
            lexemes.add("float");
            
            n++;
        }

        if (x.equalsIgnoreCase(
                "long")) {
            lexemes.add("long");
            n++;
        }

        // if n > 0 then there is a datatype
        //if n =0 then there is NO datatype
        return n;

    }

    // this function takes in a string and checks the last character of the string to see if statements and methods are properly closed
    int endStatement(String theStr) {
        char last = theStr.charAt(theStr.length() - 1);

        // if statement that determines if statement has ended properly
        if (last == ';' || last == '{' || last == '(' || last == ')' || last == '}') {
            return 1;
        } else {
            return 0;
        }
    }

    int isVariable(String h) {
        if (h.contains("(")) {
            String[] g = h.split("(");
            int p = isDataType(g[0]);
            if (p == 0) {
                return 1;
            }
        }
        if (h.contains(",")) {
            String[] g = h.split(",");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> ,");
            }
        }
        if (h.contains("*")) {
            String[] g = h.split("*");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> *");
            }
        }
        if (h.contains("=")) {
            String[] g = h.split("=");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> =");
            }
        }
        if (h.contains(")")) {
            String[] g = h.split(")");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> )");
            }
        }
        if (h.contains("+")) {
            String[] g = h.split("+");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> +");
            }
        }
        if (h.contains("-")) {
            String[] g = h.split("-");
            int p = isDataType(g[0]);
            if (p == 0) {
                return 1;
            }
        }
        if (h.contains("/")) {
            String[] g = h.split("/");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> /");
            }
        }
        if (h.contains(";")) {
            String[] g = h.split(";");
            int p = isDataType(g[0]);
            if (p == 0) {
                System.out.print(" <var> ;");
            }
        }
    }

}
