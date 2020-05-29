/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author dell
 */
public class Task1 {
    public static void main(String[] args){
     m1();
        System.out.println(m2());
        System.out.println(m3(5));
        System.out.println(m4('a',"hello"));
     
    }
    
     public static void m1(){
        System.out.println("no return type");
    }
     public static int m2(){
         int n=2+3;
         return n;
     }
     public static int m3(int a){
         
         int n=a+1;
         return n;
     }
     public static  char m4(char c,String s){
         
         
         return c;
     }
     
     
}
