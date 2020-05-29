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
public class basic_18 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any string:");
        String s=sc.nextLine();
        
        boolean isVisited;
        boolean visited[]= new boolean[s.length()];
         
        int count=0;
        for(int i=0;i<s.length();i++){
            
            char temp=s.charAt(i);
            isVisited=false;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==temp && !visited[j]){
                        visited[j]=true;
                        isVisited=true;
                        count++;
                    }
                }
                if(isVisited){
                     System.out.println(temp + " appeared "+count+" times ");
                 
                    }
                 count=0;
             
            }
          
            
        }
    
}
