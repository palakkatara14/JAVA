import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            char currentcharacter=a[i];
            if(i%2==0){
                a[i]=(char)(currentcharacter+1);
            }
            else{
                a[i]=(char)(currentcharacter-1);
            }
        }
        String result=new String(a);
        System.out.println(result);
    }
}























		

