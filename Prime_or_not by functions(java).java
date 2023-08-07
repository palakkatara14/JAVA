import java.util.*;
public class Functions{
    public static void Prime_Or_Not(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
            if (n%i==0){
                count+=1;
            }
            
        if (count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
       
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Prime_Or_Not(n);
        
        
        
        
        
    }
}
