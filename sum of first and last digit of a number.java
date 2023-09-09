import java.util.*;
    public class Main{
        public static void main(String[]args){
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int last=0;
            last=n%10;
            System.out.println(last);
            while(n>=10){
                n=n/10;
                
            }
           
            System.out.println(n);
            System.out.println(last+n);
    
    }
    
}