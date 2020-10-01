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
public class basic_22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s+" ";
        String S="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' '){
                for(int j=0;j<S.length()-1;j++){
                    if(S.charAt(j)==S.charAt(j+1)){
                        System.out.println(S);
                        break;
                    }
                }
               S="";
            }
            else{
                S=S+s.charAt(i);
            }
        }
        
    }
}
