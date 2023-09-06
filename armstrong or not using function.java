import java.util.*;
    public class Functions{
        public static void Armstrong_Or_Not(int n){
            int r;
            int sum=0;
            int k;
            
            
            k=n;
            while(n!=0){
                r=n%10;
                n=n/10;
                sum=sum+(int)Math.pow(r,3);
               
                
            }
            if(k==sum){
                System.out.println("armstrong");
            }
            else{
                System.out.println("not armstrong");
            }
            
        }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Armstrong_Or_Not(n);
    }
    
}