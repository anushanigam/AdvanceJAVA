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
public class pattern_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        
        for(int i=0;i<n;i++){
            int k=-1;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            
            
            for(int j=0;j<2*i+1;j++){
                
                
                if(j==i){
                    
                    System.out.print(s.charAt(i));
                }
                if(j<i){
                    k++;
                    System.out.print(s.charAt(k));
                    
                }
                if(j>i){
                    
                    System.out.print(s.charAt(k));
                    k=k-1;
                }
             }
            System.out.println();
            
               
                 
                   
                
            
        
    }
    
   } 
}
