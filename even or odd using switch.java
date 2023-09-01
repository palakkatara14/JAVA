import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        switch(n%2==0?1:0){
            case 1:
                System.out.println("even");
                break;
            case 0:
                System.out.println("odd");
                break;
        }
    }
}