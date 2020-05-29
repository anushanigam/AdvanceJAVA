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
public class activity2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                System.out.print("z");
            }
            else
                System.out.print(s.charAt(i));

        }
        
        
        
    }
    
}
