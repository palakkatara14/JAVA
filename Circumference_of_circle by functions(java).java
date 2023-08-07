import java.util.*;
public class Functions{
    public static double Circumference_Of_Circle(double r){
            double c=2*3.14*r;
            return c;
        
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r=sc.nextInt();
        
        double c=Circumference_Of_Circle(r);
        System.out.println(c);
    }
    

}

