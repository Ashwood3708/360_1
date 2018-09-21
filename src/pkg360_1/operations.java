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

        if (x.equals("") || x.equals(" ")) {
            return 1;
        }
        if (x.equals("}")) {
            isToken(x);
            return 1;
        }
        if (x.equals(
                "double")) {
            isToken(x);
            return 1;
        }

        if (x.equals(
                "int")) {
            isToken(x);
            return 1;
        }

        if (x.equals(
                "char")) {
            isToken(x);
            return 1;
        }

        if (x.equals(
                "String")) {
            isToken(x);
            return 1;
        }

        if (x.equals(
                "float")) {
            isToken(x);

            return 1;
        }

        if (x.equals(
                "long")) {
            isToken(x);
            return 1;
        }

        // if n=1 then there is a datatype or }
        //if n =0 then there is variable
        return 0;

    }

    // this function takes in a string and checks the last character of the string to see if statements and methods are properly closed
    int endStatement(String theStr) {
        if (theStr.equals("") || theStr.equals(" ")) {
            return 1;
        } else {
            char last = theStr.charAt(theStr.length() - 1);

            // if statement that determines if statement has ended properly
            if (last == ';' || last == '{' || last == '}') {
                //System.out.print(" YES ");
                String d = Character.toString(last);
                isToken(d);
                return 1;
            } else {
                // System.out.print(" NO ");
                return 0;
            }
        }

    }

    int isSymbol(String h) {
        try {

            if (h.equals("+") || h.equals("-") || h.equals("*") || h.equals("/") || h.equals("=")) {
                isToken(h);
                return 1;
            }
            if (h.equals(";")) {
                isToken(h);
                return 2;
            }

            if (h.contains("(){")) {
                isToken("(");
                isToken(")");
                isToken("{");
                return 1;
            }
            if (h.contains("){")) {
                isToken(")");
                isToken("{");
                return 1;
            }

            if (h.contains("(")) {
                isToken("(");
                return 2;

            }
            if (h.equals(",")) {
                isToken(",");
                return 2;

            }
            if (h.contains("*")) {
                isToken("*");
                return 1;
            }
            if (h.contains("/")) {
                isToken("/");
                return 1;
            }
            if (h.contains("-")) {
                isToken("-");
                return 1;
            }
            if (h.contains("+")) {
                isToken("+");
                return 1;
            }
            
            
            
            if (h.contains(")")) {
                isToken(")");
                return 3;

            }
            if (h.equals("{")) {
                isToken(h);
                return 4;
            }

            isToken(h);
            return 1;

        } catch (Exception e) {

            System.out.println("program will not run 2 = " + h);
        }
        return 0;
    }

    int isV(String[] h, int start) {
        for (int i = start; i < h.length; i++) {
            if (openStatement(h[i]) == 0) {//if var
                i++;
                if (i == (h.length - 1) && isSymbol(h[i]) == 0) {//if not operand or ends on variable
                    System.out.println(h[i]);
                    return 0; //will not run
                } else if (i < (h.length) && isSymbol(h[i]) == 2 && openStatement(h[i + 1]) == 1) {  //if open paranthesis
                    i++;
                } else if ((i + 1) == (h.length - 1) && isSymbol(h[i]) == 3 && isSymbol(h[i + 1]) == 4) {  //if close paranthesis then open brace
                    //System.out.println(h[i] + " " + h[i + 1]);
                    return 1;
                }
            } else {
                System.out.println(h[i] + " " + h[i + 1]);
                return 0; //if not a variable will not run
            }
        }
        return 1;
    }

    void isToken(String p) {
        int n = 0;
        // switch statement that finds lexemes and tokens and add them to an arrayList
        String x = p;
        switch (x) {

            case "double":
                lexemes.add("double");
                tokens.add("DATA_TYPE");
                break;

            case "int":
                lexemes.add("int");
                tokens.add("DATA_TYPE");
                break;

            case "char":
                lexemes.add("char");
                tokens.add("DATA_TYPE");
                break;

            case "String":
                lexemes.add("String");
                tokens.add("DATA_TYPE");
                break;

            case "float":
                lexemes.add("float");
                tokens.add("DATA_TYPE");
                break;

            case "=":
                lexemes.add("=");
                tokens.add("ASSIGN_OP");
                break;

            case "-":
                lexemes.add("-");
                tokens.add("SUB_OP");
                break;

            case "+":
                lexemes.add("+");
                tokens.add("ADD_OPP");
                break;

            case "*":
                lexemes.add("*");
                tokens.add("MUL_OP");
                break;

            case "/":
                lexemes.add("/");
                tokens.add("DIV_OP");
                break;

            case "%":
                lexemes.add("%");
                tokens.add("MOD_OP");
                break;

            case ">":
                lexemes.add(">");
                tokens.add("GREAT_OP");
                break;

            case "<":
                lexemes.add("<");
                tokens.add("LESS_OP");
                break;

            case "{":
                lexemes.add("{");
                tokens.add("OPEN_CURLB");
                break;

            case "}":
                lexemes.add("}");
                tokens.add("CLOSE_CULRB");
                break;

            case "[":
                lexemes.add("[");
                tokens.add("OPEN_BRACK");
                break;

            case "]":
                lexemes.add("]");
                tokens.add("CLOSED_BRACK");
                break;

            case "(":
                lexemes.add("(");
                tokens.add("OPEN_PAR");
                break;

            case ")":
                lexemes.add(")");
                tokens.add("CLOSED_PAR");
                break;

            case ";":
                lexemes.add(";");
                tokens.add("SEMICOLON");
                break;

            case ":":
                lexemes.add(":");
                tokens.add("COLON");
                break;

            case ",":
                lexemes.add(",");
                tokens.add("COMMA");
                break;

            default:
                lexemes.add(x);
                tokens.add("IDENT");
                break;
        }
    }

    void print() {
        operations.print(lexemes, tokens);
    }

    public static void print(ArrayList<String> lex, ArrayList<String> tok) {
        String heading1 = "Lexemes";
        String heading2 = "Tokens";
        String divider = "------------------------------------";
        System.out.printf("%-15s %-15s %n", heading1, heading2);
        System.out.println(divider);
        for (int i = 0; i < lex.size(); i++) {
            System.out.printf("%-15s %-15s %n", lex.get(i), tok.get(i));
        }
        System.out.println(divider);
    }

}
