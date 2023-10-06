import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count+=1;
                }
            }
            if(count==3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}