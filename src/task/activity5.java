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
public class activity5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("string 1");
        String s1 = sc.next();
        System.out.println("string 2");
        String s2 = sc.next();
        String S=" ";
        for(int i=s2.length()-1;i>=0;i--){
            S=S+s2.charAt(i);
        }

        
        String s=s1 +S;
        System.out.println(s);
    }
    
}
