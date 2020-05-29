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
public class basic_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day:");
        String s=sc.nextLine();
      
        switch(s){
            case "Monday":
                System.out.println("Day 1");
                break;
            case "Tuesday":
                System.out.println("Day 2");
                break;
            case "Wednesday":
                System.out.println("Day 3");
                break;
            case "Thursday":
                System.out.println("Day 4");
                break;
            case "Friday":
                System.out.println("Day 5");
                break;
            case "Saturday":
                System.out.println("Day 6");
                break;
            case "Sunday":
                System.out.println("Day 7");
                break; 
            
                
             
        }  
        
          
        
    }
    
}
