import java.util.*;
public class Main{

     public static void abundant(int n){
         int sum=0;
         for(int i=1;i<n;i++){
             if(n%i==0){
                 sum=sum+i;
             }
         }
         System.out.println("the sum is:");
         System.out.println(sum);
     
     
        if(sum>n){
             System.out.println("abundant number");
        }
        else{
             System.out.println("not abundant number");
        }
    
     }
        
       
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        abundant(n);
    }
}