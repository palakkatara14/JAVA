import java.util.*;
    public class Functions{
        public static void perfect_or_not(int n){
           
            int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum=sum+i;
                }
            }
                
        
           
                
            
            if(sum==n){
                System.out.println("perfect");
            }
            else{
                System.out.println("not perfect");
            }
            
        }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfect_or_not(n);
    }
    
}