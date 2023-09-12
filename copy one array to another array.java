import java.util.*;
public class Main{
   
    public static void Array_Copy(int[] arr1,int n){
        
       System.out.print("the created array is:");
         for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
            
           
            
        }
       
        int[] arr2=new int[n];
        
        for(int i=0;i<n;i++){
            arr2[i]=arr1[i];
        }
       
        System.out.println("copied array:");
        for(int i=0;i<n;i++){
            
            System.out.println(arr2[i]);
        }
        
        
        
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
        int[] arr1=new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        
        
         Array_Copy(arr1,n);
   }
   
   
   
}
