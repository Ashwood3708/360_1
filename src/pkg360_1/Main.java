/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360_1;
import java.io.*; 
import java.util.*;
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
        
       try{
       
           File file = new File("360_txt.txt"); 
           Scanner sc = new Scanner(file);
           sc.nextLine();
          String datatype = sc.next();
          
          if(datatype.equalsIgnoreCase("void")){
          
          }else if(datatype.equals("double") || datatype.equals("int") || datatype.equals("char")|| datatype.equals("String") || datatype.equals("float") || datatype.equals("long")){
          
          }
           
           System.out.println("ok");
           
           
           
           
       }catch(Exception e) {
       System.out.println("error");
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
