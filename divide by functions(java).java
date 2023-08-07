import java.util.*;
public class Functions{
    public static int Calculate_Divide(int a,int b) {
        int divide=a/b;
        return divide;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int divide= Calculate_Divide(a,b);
        System.out.println(divide);
    }
    

}