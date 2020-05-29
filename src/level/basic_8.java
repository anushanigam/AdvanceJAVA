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
public class basic_8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        String s1="";
        String s2="";
        
        for(int i=0;i<s.length();i++){
            
            if(Character.isUpperCase(s.charAt(i))){
                s1 = s1 + s.charAt(i);
                System.out.print(s1.toLowerCase());
                s1="";
            }    
            else{
               
                s2=s2+s.charAt(i);
                System.out.print(s2.toUpperCase());
                s2="";
            }
        }
    }    
}                 
            
            
    
    

