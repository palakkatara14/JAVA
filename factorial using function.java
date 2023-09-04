import java.util.*;
public class Main{
    public static void factorial(int n){
        int f=1;
        int i=1;
        while(i<=n){
            f=f*i;
            i++;
            
        }
        System.out.println(f);
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          factorial(n);
    }
      
      
      
      
}
