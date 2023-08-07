import java.util.*;
public class recursion3{
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc"->"ab"
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,permutation+currChar);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printPerm(str,"");
    }


}
//time complexity=O(n!)
