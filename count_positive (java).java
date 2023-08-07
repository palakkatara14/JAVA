import java.util.*;
public class main{
    
    public static void main(String[] args){
        int positive=0;int negative=0;int zeros=0; 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        for(int i=1;i<=n;i++){
            if (a>0){
                positive++;
                
            }
            else if (a<0){
                negative++;
                
            }
            else{
                zeros++;
                
            }
            
            
        }   
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);
    }
    
    

}


