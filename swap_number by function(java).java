import java.util.*;
public class Functions{
    public static void Swap_number(int a,int b){
        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Swap_number(a,b);
    }
}
   