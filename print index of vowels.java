import java.util.*;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
                
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.print(i+" ");
            }
        }
        
         
}
}
