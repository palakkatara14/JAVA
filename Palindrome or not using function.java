import java.util.*;
public class Main{
      public static void Palindrome_or_not(int n){
      
      int r;
      int sum=0;
      int k;
      
      k=n;
      while(n>0){
          r=n%10;
          n=n/10;
          sum=(sum*10)+r;

          
      }
      if(k==sum){
          System.out.println("palindrome");
      }
      else{
          System.out.println("not palindrome");
      }}
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          Palindrome_or_not(n);
      }
      
      
      }
      
