import java.util.*;
    public class Main{
        public static void  Sum_Of_Array_Element(int[] arr,int n){
            int sum=0;
            
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
            }
            System.out.println(sum);
            
     
        }
       public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[] arr=new int[n];
        
          for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
         }
        
         Sum_Of_Array_Element(arr,n);
    }
    
    
}