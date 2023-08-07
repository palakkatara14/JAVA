import java.util.*;
public class Strings{
    public static void main(String[]args){
        
       Scanner sc=new Scanner(System.in);
       String firstname=sc.next();
       String lastname=sc.next();
       String fullname=firstname+" "+lastname;
       System.out.println(fullname);
       System.out.println(fullname.length());
       //CharAt()
       for(int i=0;i<fullname.length();i++){
           System.out.println(fullname.charAt(i));
       }
        
    }
}