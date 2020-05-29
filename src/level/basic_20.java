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
public class basic_20 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].length()>=5){
                System.out.println(a[i]);
            }
            
            
        }
        
    }
    
}
