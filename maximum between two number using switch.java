import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        
        switch(a>b?1:0){
            
           
            case 1:
                System.out.println("a is greater");
                break;
            case 0:
                switch(a==b?1:0){
                    case 1:
                        System.out.println("both are equal");
                        break;
                    case 0:
                        System.out.println("b is greater");
                        break;
                    
                }
                
        }
          
    }
}