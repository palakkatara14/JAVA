public class Functions{
    public static void Print_Power(int x,int n){
        int c=(x^n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int c=Print_Power(x,n);
        System.out.println(c);
    }




    
}