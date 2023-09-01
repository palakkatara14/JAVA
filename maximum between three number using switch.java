import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        
        switch(a>b&&a>c?1:0){
            
           
            case 1:
                System.out.println("a is greater");
                break;
            case 0:
                switch(b>a&&b>c?1:0){
                    case 1:
                        System.out.println("b is greater");
                        break;
                    case 0:
                        System.out.println("c is greater");
                        break;
                    
                }
                
        }
          
    }
}