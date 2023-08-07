import java.util.*;
public class Strings{
    public static void main(String[]args){
        //concatenation
       // String firstname="Tony";
       // String lastname="Stark";
       // String fullname=firstname+lastname;
       // System.out.println(fullname);
       Scanner sc=new Scanner(System.in);
       String firstname=sc.next();
       String lastname=sc.next();
       String fullname=firstname+" "+lastname;
       System.out.println(fullname);
       System.out.println(fullname.length());
        
    }
}