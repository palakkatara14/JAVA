import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            double quantity=sc.nextDouble();
            double price=sc.nextDouble();
            if(quantity>1000.0){
                double c=quantity*price;
                double d=(10.0/100.0)*c;
                double  e=c-d;
                System.out.println(String.format("%.6f",e));
            }
            else{
                System.out.println(String.format("%.6f",(quantity*price)));
            }
            
        }
    }
}