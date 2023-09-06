import java.util.*;
public class Main{

     
        public static void addition_two_fraction(int n1,int n2,int d1,int d2){
                //cross multiply
                int n3=(n1*d2)+(n2*d1);
                //find lcm
                int d3=d1*d2;
                System.out.println(n3+"/"+d3);
                
                
        }
		          
		public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int d1=sc.nextInt();
            int d2=sc.nextInt();
            addition_two_fraction(n1,n2,d1,d2);
        
    
    }
    
}
