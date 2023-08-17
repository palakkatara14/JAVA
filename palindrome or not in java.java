import java.util.*;
public class Main{
      public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int r,t=0,k;
      int n=sc.nextInt();
      k=n;
      while(n>0){
          r=n%10;
          n=n/10;
          t=(t*10)+r;

          
      }
      if(k==t){
          System.out.println("palindrome");
      }
      else{
          System.out.println("not palindrome");
      }
      
      
      
      }
      
}