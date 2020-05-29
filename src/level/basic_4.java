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
public class basic_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            

        }
        System.out.println("No. of vowel present : " + count);
        
    }
    
}
