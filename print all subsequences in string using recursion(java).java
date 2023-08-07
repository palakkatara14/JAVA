import java.util.*;
public class recursion2{
    
    
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //to be
        subsequences(str,idx+1,newString+currChar);
        //not to be
        subsequences(str,idx+1,newString);
        
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        subsequences(str,0,"");
    }
}
//time complexity=O(2^n)