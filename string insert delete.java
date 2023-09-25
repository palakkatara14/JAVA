import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Tony");
        sb.insert(2,'n');
        System.out.println(sb);
        
        sb.delete(2,3);
        System.out.println(sb);
    }   
}