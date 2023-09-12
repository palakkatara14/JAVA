 import java.util.*;
public class Main{
   
    public static void Array_Concatenation(int[] arr1,int[] arr2,int n1,int n2){
        
        System.out.println("the first array is :");
        for(int i=0;i<n1;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("the second array is :");
        for(int i=0;i<n2;i++){
            System.out.println(arr2[i]);
            
        }
        int[] arr3=new int[n1+n2];
        int j=0;
        
        System.out.println("copy arr1 to arr3:");
        for(int i=0;i<n1;i++){
            arr3[j]=arr1[i];
            j++;
        }
        System.out.println("copy arr2 to arr3");
        for(int i=0;i<n2;i++){
            arr3[j]=arr2[i];
            j++;
        }
        
        System.out.println("the array after concatenation:");
        for(int i=0;i<j;i++){
            System.out.println(arr3[i]);
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
        
        
         Array_Concatenation(arr1,arr2,n1,n2);
   }
   
   
   
}