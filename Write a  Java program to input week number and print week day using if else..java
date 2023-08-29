import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      if(n==1){
          System.out.println("monday");
      }
      if(n==2){
          System.out.println("tuesday");
      }
      if(n==3){
          System.out.println("wednesday");
      }
      if(n==4){
          System.out.println("thursday");
      }
      if(n==5){
          System.out.println("friday");
      }
      if(n==6){
          System.out.println("saturday");
      }
      if(n==7){
          System.out.println("sunday");
      }
   }
}