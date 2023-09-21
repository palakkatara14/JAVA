import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int alphabets=0;
        int digits=0;
        int special_characters=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='z')){
                alphabets++;
            }
            else if(ch>=48 && ch<=57){
                digits++;
            }
            else{
                special_characters++;
            }
        }
        System.out.println(alphabets);
        System.out.println(digits);
        System.out.println(special_characters);
        
        
        
        
    }
}
