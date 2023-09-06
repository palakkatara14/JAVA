import java.util.*;
public class Main{

     public  static String DecToBin(int num){
        
        String sum=" ";
        while(num>0){
            sum=num%2+sum;
            num=num/2;
        }
        return sum;
    
     }
        
       
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        System.out.println(DecToBin(num));
    }
    
}
