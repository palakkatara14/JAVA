import java.util.*;
public class Functions{
    public static void Print_Table(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        
       
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Print_Table(n);
        
        
        
        
        
    }
    

}
