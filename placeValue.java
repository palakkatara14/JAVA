import java.util.*;
public class Main{
    public static void placeValue(int n){
        int r=1;
        while(n>9){
            r=r*10;
            n=n/10;
        }
        System.out.println(r);
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          placeValue(n);
    }
      
      
      
      
}