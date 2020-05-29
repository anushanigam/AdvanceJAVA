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
public class pattern_8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                    
                System.out.print(i+" ");
                }
                else{
                    System.out.print("0 ");
                
                }
            }
            
            
            System.out.println();
        }
            
        
    }
    
}
