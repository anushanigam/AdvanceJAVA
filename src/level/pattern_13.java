/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class pattern_13 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=1;i<=n/2;i++){
              for(int j=1;j<=(n/2+1)-i;j++){
                  System.out.print("* ");
              }
              
              for(int j=1;j<=2*i-1;j++){
                  System.out.print("  ");
              }
              System.out.print(" ");
              for(int j=1;j<=(n/2+1)-i;j++){
                  System.out.print("* ");
              }
               
              System.out.println();
          }
          System.out.println(" ");
            for(int i=1;i<=n/2;i++){
               for(int j=1;j<=i;j++){
                  System.out.print("* ");
              }  
               for(int j=1;j<=n-2*i;j++){
                  System.out.print("  ");
              }
               System.out.print(" ");
               for(int j=1;j<=i;j++){
                  System.out.print("* ");
              }  
               
                System.out.println();
            }   
          
    }
    
}
