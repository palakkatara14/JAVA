import java.util.*;
public class Main{
   
    public static void Array_Intersection(int[] arr1,int[] arr2,int n1,int n2){
        
        System.out.print("the first array is:");
        for(int i=0;i<n1;i++){
            System.out.println(arr1[i]);
            
        }
        System.out.println("the second array is:");
        for(int i=0;i<n2;i++){
             System.out.println(arr2[i]);
        }
            
        
        
        System.out.println("intersection of given array:");  
         
        for(int i = 0; i < n1; i++) {  
            for(int j =0; j < n2; j++) {  
                if(arr1[i] == arr2[j]){ 
                   System.out.println(arr2[j]);
                }
            }
            
        }
        
   }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
      
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
       
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        
        
        
        Array_Intersection(arr1,arr2,n1,n2);
   }
   
   
   
}