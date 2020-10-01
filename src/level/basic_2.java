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
public class basic_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First name:");
        String f=sc.next();
        System.out.println("Middle name:");
        String m=sc.next();
        System.out.println("Last name:");
        String l=sc.next();
        System.out.println("Full Name:"+ f+" "+ m+" "+ l);
        System.out.println("short form:"+ f.charAt(0)+"."+m.charAt(0)+"."+l.charAt(0) );
    }
    
}
