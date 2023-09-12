import java.util.*;
    public class Main{
        static int factorial(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
        
            
        }
        public static void isStrong(int n){
               int sum=0;
               int r;
               int k;
               k=n;
               while(n>0){
                   r=n%10;
                   sum=sum+factorial(r);
                   n=n/10;
               }
               if(sum==k){
                   System.out.println("Strong");
               }
               else{
                   System.out.println("not strong");
               }
           
           }
           public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               isStrong(n);
           }
           
             
           
    }
    