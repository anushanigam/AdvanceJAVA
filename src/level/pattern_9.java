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
public class pattern_9 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=n-i;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                
               if(j<((2*i-1)/2)+1){
                   k++;
                   System.out.print(k);
                   
               }
               if(j==((2*i-1)/2)+1){
                   System.out.print("0");
               }
               if(j>((2*i-1)/2)+1){
                   System.out.print(k);
                   k--;
               }  
            }
           System.out.println();
        }
     }
}
