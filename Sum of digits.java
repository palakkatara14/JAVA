import java.util.*;
public class Main{
    public static void SumOfDigits(int n) {
          int r;
          int sum=0;
          while(n>0){
              r=n%10;
              sum=sum+r;
              n=n/10;
          }
          System.out.println(sum);
       
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        SumOfDigits(n);
        
        
        
        
        
    }
}