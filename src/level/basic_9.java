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
public class basic_9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String S="";
        for(int i=s.length()-1;i>=0;i--){
            S=S+s.charAt(i);
        }
        if(S.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
    
    
}
