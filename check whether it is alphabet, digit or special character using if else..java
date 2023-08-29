import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
          System.out.println("alphabet");
      }
      else if(ch>=48&&ch<=57){
          System.out.println("digit");
      }
      else{
          System.out.println("special character");
      }
      
   }
}