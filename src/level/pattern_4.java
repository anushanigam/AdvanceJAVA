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
public class pattern_4 {
    public  static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        
        String m="";
        for(int j=0;j<s.length();j++){
            for(int i=0;i<s.length()-1;i++){
                m=m+s.charAt(i+1);
               
              }
            m=m+Character.toLowerCase(s.charAt(0));
            System.out.println(m);
            s=m;
            m="";
            }
            
        }
   
}
