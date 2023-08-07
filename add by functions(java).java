import java.util.*;
public class Functions{
    public static int Calculate_Sum(int a,int b) {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= Calculate_Sum(a,b);
        System.out.println(sum);
    }
    

}