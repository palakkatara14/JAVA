import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        double Y=sc.nextDouble();
        if(X%5==0&&Y>X){
         System.out.println(String.format("%.2f",(Y-X-0.50)));
       }
       else{
           System.out.println(String.format("%.2f",Y));
       }                    
                              
    }
}