import java.util.*;
public class Main{

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=sc.nextInt();
        char[] a=new char[n];
        int i;
        for( i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
        int index=-1;
        for( i=0;i<n;i++){
            if(a[i]==ch){
                index=i;
                break;
            }
        }
        
        if(index!=-1){
           System.out.println(i+" ");
        }
        else{
            System.out.println("-1");
        }
        
                               
    }
}