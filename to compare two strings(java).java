import java.util.*;
public class Strings{
    public static void main(String[]args){
       //String compare
      // String name1="Tony";
       //String name2="Tony";
       //1 s1>s2:+ve value
       //2 s1==s2:0
       //3 s1<s2:-ve value
      // if(name1.compareTo(name2)==0){
          // System.out.println("strings are equal");
        //}
      // else{
          // System.out.println("strings are not equal");
      // }
        
       Scanner sc=new Scanner(System.in);
       String name1=sc.next();
       String name2=sc.next();
       if(name1.compareTo(name2)==0){
           System.out.println("strings are equal");
       }
       else{
           System.out.println("strings are not equal");
       }
        
    }
}