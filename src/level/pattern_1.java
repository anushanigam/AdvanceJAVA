/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package level;
import java.util.*;
/**
 *
 * @author dell
 */
public class pattern_1 {
   public static void main(String[] args){
       Scanner sc=new Scanner (System.in);
       String s=sc.nextLine();
       for(int i=0;i<s.length();i++){
           for(int j=0;j<=i;j++){
               System.out.print(s.charAt(j));
               
           }
           System.out.println();
       }
   } 
}
