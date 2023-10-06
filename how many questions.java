import java.util.*;
public class Main {
    public static void main (String args[]) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int sum=0;
           for(int i=0;i<n;i++){
               int a=sc.nextInt();
               int b=sc.nextInt();
               int c=sc.nextInt();
               int d=a+b+c;
               if(d>1){
                   sum++;
               }
           }
           System.out.println(sum);
    }
}