import java.util.*;
public class Functions{
    public static int Calculate_Product(int a,int b) {
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product= Calculate_Product(a,b);
        System.out.println(product);
    }
    

}