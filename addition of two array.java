import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n];
        System.out.println("the addition is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr3[i]=arr1[i]+arr2[i];
                
            }
            System.out.println(arr3[i]);
        }
        
    }
}