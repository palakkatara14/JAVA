import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //if(a>b&&a>c){
        //    System.out.println("a is greatest");
       // }
        //else if(b>a&&b>c){
         //   System.out.println("b is greatest");
        //}
       // else{
          //  System.out.println("c is greatest");
       // }
       int d=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
       System.out.println(d);
       
       
    }
}