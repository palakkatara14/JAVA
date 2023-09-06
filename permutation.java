import java.util.*;
public class Main{

     
        public static int factorial(int n){
                int f=1;
                for(int i=1;i<=n;i++){
                    f=f*i;
                }
                return f;
                
                
        }
		          
		public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            int n=sc.nextInt();
            int r=sc.nextInt();
            int a=factorial(n);
            int b=factorial(n-r);
            System.out.println(a/b);
        
    
    }
    
}
