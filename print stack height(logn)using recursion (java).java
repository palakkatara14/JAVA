public class recursion1{
    public static void calcPower(int x,int n){
        if(n==0){
            
           return 1;   
        }
        if(x==0){
            return 0;   
        }
           //if n is even 
        if(n%2==0){
            return calcPower(x,x/2)*calcPower(x,x/2);
        }
        else{//n is odd 
            return calcPowe(x,x/2)*calPowe(x,x/2)*x;
            
        }
        
    }
    public static void main(String[]args){
        int x=2;
        int n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
