import java.util.*;
public class Main{
    public static void Power(int x,int n){
        int c=(int)Math.pow(x,n);
        System.out.println(c);
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int n=sc.nextInt();
          Power(x,n);
    }
      
      
      
      
}
