import java.util.*;

public class Main{
   
   public static void main(String[]args){
   
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size/length of array");
     int n=sc.nextInt();
     int[] arr=new int[n];
     
     
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           
            
        }
        
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else{
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        
        
   }
   
   
   
}
  