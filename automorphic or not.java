import java.util.*;
    public class Functions{
    
           
        public static boolean isAutomorphic(int n) {
        int square = n * n;

        while (n > 0) {
                if (n % 10 != square % 10){
                      return false;
                }
                n /= 10;
                square /= 10;
       }
    
       return true;
       }
   

        
           
           
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");   
    }
    
}