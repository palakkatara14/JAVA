import java.util.*;
public class Main{
   
    public static void Largest_Element(int[] arr,int n){
        
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        
        System.out.println(max);
        
        
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
          int[] arr=new int[n];
        
          for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
         }
        
         Largest_Element(arr,n);
   }
   
   
   
}