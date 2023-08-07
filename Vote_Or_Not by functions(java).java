import java.util.*;
public class Functions{
    public static boolean Vote_Or_Not(int age ){
            if (age>18){
                return true;
            }
            else{
                return false;
            }
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        
        boolean c=Vote_Or_Not(age);
        System.out.println(c);
    }
    

}

