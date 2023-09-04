import java.util.*;

public class Main{
   
   public static void main(String[]args){
   
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size/length of array");
     int n=sc.nextInt();
     int[] arr1=new int[n];
    
     
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            
           
            
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
   
   
   
}
  