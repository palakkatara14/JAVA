/*import java.util.*;
public class fact{
    public static void fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println(f);
        
        
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
        
        
    }
}*/
import java.util.*;
public class fact{
    public static int fact(int n){ //void //no return
        int f=1;
        int i=1;
        while(i<=n){
            f=f*i;
            System.out.println(f);
            i++;
           
        }
        return f;
        
        
        
        
        
    }
    
       
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact f=new fact();
        f.fact(n);
        
        
    }
}