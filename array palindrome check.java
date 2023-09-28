import java.util.*;
public class Main
{    public static void Palindrome(int a[],int n){
       
       for(int i=0; i<n/2; i++){
           if(a[i]!=a[n-i-1]){
         System.out.println("not palindrome");
         }
        else{
            System.out.println("palindrome");
         }
       }
       
         
         
         
    
        
    }   
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
	     	a[i]=sc.nextInt();
		Palindrome(a,n);
	}
}