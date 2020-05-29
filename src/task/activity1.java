/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class activity1 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String S="";
        for(int i=s.length()-1;i>=0;i--){
            S=S+s.charAt(i);
        }
        System.out.println(S);
    }
    
}
