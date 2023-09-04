import java.util.*;
public class Main{
    public static void Reverse(int n) {
          
          int r=0;
          while(n>0){
              r=r*10+(n%10);//sum=sum*10+r
              n=n/10;
              
          }
          System.out.println(r);
       
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Reverse(n);
        
        
        
        
        
    }
}