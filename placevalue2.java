import java.util.*;
public class Main{
    public static void placeValue(int n){
        int pv=0;
         
        while(n>0){
            int c=n%10;
            int d=(int)Math.pow(10,pv);
            System.out.println(c);
            System.out.println(d);
            pv++;
            n/=10;
        }
        
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
         
          int n=sc.nextInt();
          placeValue(n);
    }
      
      
      
      
}
