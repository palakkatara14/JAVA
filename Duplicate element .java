import java.util.*;
public class Main{
   
    public static void Duplicate_Element(int[] arr,int n){
        
       System.out.print("the created array is:");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            
           
            
        }
       
        System.out.println("Duplicate elements in given array:");  
        //Searches for duplicate element  
        for(int i = 0; i < n; i++) {  
            for(int j = i + 1; j < n; j++) {  
                if(arr[i] == arr[j]){ 
                    System.out.println(arr[j]); 
                }
            }  
        }
        
   }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
        int[] arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        
         Duplicate_Element(arr,n);
   }
   
   
   
}