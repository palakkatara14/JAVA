import java .util.*;
public class Bits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if (oper==1){
            int bitMask=1<<i;
            int newNumber=notbitMask|n;
            System.out.println(newNumber);
        }
        else{
            int notbitMask=~(bitMask);
            int newNumber=notbitMask&n;
            System.out.println(newNumber);
        }
    }
}