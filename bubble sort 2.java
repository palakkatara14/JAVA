import java.util.*;
public class Main{
   
    public static void Array_Sort(int[] arr,int n){
        
       
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i]);
        }
        
        
        
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
        int[] arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        
         Array_Sort(arr,n);
   }
   
   
   
}
        
       
        
        
        
