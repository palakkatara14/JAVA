import java.util.*;
public class Main{
    public static void lcm(int n1,int n2){
        int lcm;
        lcm=(n1>n2)?n1:n2;
        while(true){
            if(lcm%n1==0&&lcm%n2==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        
    }
        
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        lcm(n1,n2);
    }
}