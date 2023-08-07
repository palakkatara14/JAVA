import java.util.*;
public class Functions{
    public static int Greatest_Of_Two(int a,int b){
        if (a>b){
            return a;
        }
       else{
            return b;
        }
        
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Greatest_Of_Two(a,b);
        System.out.println(c);
    }
    

}

