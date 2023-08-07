import java .util.*;
public class Bits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int notbitMask=~(bitMask);
        int newNumber=notbitMask&n;
        System.out.println(newNumber);
    }
}