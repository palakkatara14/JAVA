import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      //  String[] str={"geekforgeeks","geeks","geek","geezer"};
          String str[]= new String[n];
          for(int i=0;i<n;i++){
              str[i]=sc.next();
          }
        Arrays.sort(str);
         String s=str[0];
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean f=true;
            for(int j=0;j<str.length;j++){
                String s1=str[j];
                char c1=s1.charAt(i);
                if(c1!=c){
                    f=false;
                    break;
                }
            }
        
            if(f){
                res=res+c;
             }
             
        }
        System.out.println(res);
        
        
    }
}
//find the longest common prefix using sorting