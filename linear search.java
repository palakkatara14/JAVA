//WAP to check if a given number exist in the array or not(LINEAR SEARCH).
import java.util.*;
public class Main{
   
    public  boolean Search_Element(int[] arr,int n){
        
       System.out.print("the created array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("enter a number to be found:");
        int x=sc.nextInt();
        boolean exist=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                exist=true;
                break;
            }
        }
            
        if(exist){
            System.out.println("exist");
        }
        else{
            System.out.println("not exist");
        }
        
        
        
        
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
        int[] arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        
         Search_Element(arr,n);
   }
   
   
   
}


