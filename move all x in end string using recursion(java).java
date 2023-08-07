import java.util.*;
public class recursion2{
    
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else{
            newString+=currChar;
            moveAllX(str,idx+1,count,newString);
        }
        
        
       
       
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        moveAllX(str,0,0,"");
    }
}
//time complexity=O(2n)=O(n)