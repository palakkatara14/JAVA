import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(ch>='a'&&ch<='z'){
          System.out.println("lowercase alphabet");
      }
      else if(ch>='A'&&ch<='Z'){
          System.out.println("uppercase alphabet");
      }
     
      
   }
}