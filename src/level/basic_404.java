
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
public class basic_404 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.concat(" ");
        String a[]=s.split(" ");
        String t;
        String m="";
        for(int i=0;i<a.length;i++){
            t =a[i];
            for(int j=0;j<t.length();j++){
                if(j==0){
                    char ch=Character.toUpperCase(t.charAt(0));
                    m= m+ ch;
                    
                    
                }
                else{
                    m=m+t.charAt(j);
                    
                }
                
            }
          m=m+" ";  
        }
        System.out.println(m);
        
    }
    
}
