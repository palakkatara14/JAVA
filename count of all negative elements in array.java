import java.util.*;

public class Main{
   
   public static void main(String[]args){
   
     int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size/length of array");
     int n=sc.nextInt();
     int[] arr=new int[n];
     
     
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count+=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println(count);
        
        
   }
   
}
 