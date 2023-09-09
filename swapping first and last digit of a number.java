import java.util.*;
    public class Main{
        public static void main(String[]args){
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int last=0;
            int temp;
            last=n%10;
            
            while(n>=10){
                n=n/10;
                
            }
                System.out.println("before swapping the values of first and last: ");
                System.out.println(n);
                System.out.println(last);
                temp=n;
                n=last;
                last=temp;
                System.out.println("after swapping the values of first and last: ");
                System.out.println(n);
                System.out.println(last);
                
                
            
           
           
            
            
    }
    
}