public class recursion1{
    public static void printNum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printNum(i+1,n,sum);
        System.out.println(i);
        
        
        
    }
    public static void main(String[]args){
        printNum(1,5,0);
        
    }
}