import java.util.*;
public class Main{
   
    public static void Array_Unique(int[] arr1,int[] arr2,int n1,int n2)
    {
        
       System.out.print("the first array is:");
         for(int i=0;i<n1;i++){
            System.out.println(arr1[i]);
            
         }
         System.out.println("the second array is:");
         for(int i=0;i<n2;i++){
             System.out.println(arr2[i]);
         }
         
        int i=0;
        int j=0;
        System.out.println("unique elements in given array:");  
        
        int f=0;
        for(i = 0; i < n1; i++) 
        {  
            f=0;
            for(j =0; j < n2; j++) 
            {  
                if(arr1[i] == arr2[j]){ 
                    f=1;
                   break;
                }
            }
            if(f==0)
            System.out.println(arr1[i]);
        }
        for(int k=0; k<n2; k++)
        {
            System.out.println(arr2[k]);
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
        
        
         Array_Unique(arr1,arr2,n1,n2);
   }
   
   
   
}

















