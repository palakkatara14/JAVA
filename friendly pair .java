import java.util.*;
    public class Main{
        public static void friendly_pair(int n1,int n2){
           
            int sum1=0;
            int sum2=0;
            for(int i=1;i<=n1;i++){
                if(n1%i==0){
                    sum1=sum1+i;
                    
                }
            }
            for(int i=1;i<=n2;i++){
                if(n2%i==0){
                    sum2=sum2+i;
                }
            }
                
        
           
                
            
            if((sum1/n1)==(sum2/n2)){
                System.out.println("friendly pair");
            }
            else{
                System.out.println("not friendly pair");
            }
            
        }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        friendly_pair(n1,n2);
    }
    
}