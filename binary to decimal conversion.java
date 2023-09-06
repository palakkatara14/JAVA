//import java.util.*;
//public class Main{

     //public static void binary_to_decimal(String s){
         //int decimal=Integer.parseInt(s,2);
         //System.out.println(decimal);
    
     //}
        
       
    //public static void main(String[]args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number:");
        //String s=sc.next();
        //binary_to_decimal(s);
   // }

import java.util.*;
public class Main{

     public  static int binary_to_decimal(String num){
         int r=0;
         int len=num.length();
         for(int i=0;i<len;i++){
             char c=num.charAt(len-i-1);
             if(c=='1'){
                 r=r+((int)Math.pow(2,i));
             }
         }
         return r;
    
     }
        
       
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        String num=sc.next();
        System.out.println(binary_to_decimal(num));
    }
    
}
