import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1;
        int r;
        while(n>0){
            
            r=n%10;
            pro=pro*r;
            n=n/10;
            
        }
        System.out.println(pro);
        
    }
    
    
}