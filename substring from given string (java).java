import java.util.*;
public class Strings{
    public static void main(String[]args){
        //substring
        String sentence="My name is Tony";
        
        
        //substring(begin index,end index)
        String name=sentence.substring(11,sentence.length());
        //(11,15)
        //(11)ye isliye kyunki last index pta hi h ye last tk dedega isliye 
        
       
        System.out.println(name);
        
        
    }
}