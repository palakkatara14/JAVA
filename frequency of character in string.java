import java.util.*;
public class Main{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] a=new char[n];
        int i;
        int count=1;
        for( i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
       String s="";
        for( i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(!s.contains(a[i]+""))
            System.out.println("count of "+a[i]+": "+count);
            s=s+a[i];
        }
   }
}