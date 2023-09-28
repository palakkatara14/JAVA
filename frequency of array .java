import java.util.*;
public class Main
{   public static void frequency(int arr[])
    {
        String s="";
        int count=0;
        for(int i=0; i<arr.length; i++)
        {   count=0;
            for(int j=i; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(!s.contains(" "+arr[i]+" "))
            System.out.println(arr[i]+":"+count);
            s=s+" "+arr[i]+" ";
        }
       
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
	     	a[i]=sc.nextInt();
		frequency(a);
	}
}
