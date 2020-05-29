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
public class pattern_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                if(i!=n&&j>1&&j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
    }
        
    }
    
}
