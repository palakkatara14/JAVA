import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String c="";
        
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>=65 && str1.charAt(i)<=90){
                
                c=c+(char)(str1.charAt(i)+32);
            }
            else{
                c=c+(char)(str1.charAt(i)-32);
            }
        }
        System.out.println(c);
        
        
        
    }
}
