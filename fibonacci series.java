import java.util.*;
    public class Main{
        public static void fibonacci(int n){
            int a=0,b=1;
            for(int i=0;i<=n;i++){
                if(i==0){
                    System.out.println(0+" ");
                }
                else if(i==1){
                    System.out.println(1+" ");
                }
                else{
                    int c=a+b;
                    
                    a=b;
                    b=c;
                    System.out.println(c+" ");
                }
            }
        }
          
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            fibonacci(n);
        }
             
           
    }
    