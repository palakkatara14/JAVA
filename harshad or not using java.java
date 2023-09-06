import java.util.*;
public class Main{

     public static void harshad(int n)
    {
        
        int x = n, r, sum = 0;
         
       while(x>0)
        {
            r = x%10;
            sum = sum + r;
            x = x/10;
        }
         
        if(n%sum == 0)
            System.out.println("Harshad Number.");
        else
            System.out.println("not a Harshad Number.");      
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        harshad(n);
    }
}