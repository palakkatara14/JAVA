import java.util.*;
public class Functions{
    public static int Calculate_Difference(int a,int b) {
        int difference=a-b;
        return difference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int difference= Calculate_Difference(a,b);
        System.out.println(difference);
    }
    

}