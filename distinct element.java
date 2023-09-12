import java.util.*;
public class Main{
   
    public static void Distinct_Element(int[] arr,int n){
        
       System.out.print("the created array is:");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            
           
            
        }
        int i,j;
        System.out.println("Distinct elements in given array:");  
        //Searches for distinct element  
        for(i = 0; i < n; i++) {  
            for(j =0; j < i; j++) {  
                if(arr[i] == arr[j]){ 
                   break;
                }
            }
            if(i==j){
                System.out.println(arr[i]);
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
        
        
        
         Distinct_Element(arr,n);
   }
   
   
   
}