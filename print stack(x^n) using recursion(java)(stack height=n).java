public class recursion1{
    public static void calcPower(int x,int n){
        if(n==0){
            
           return 1;   //base case 1
        }
        if(x==0){
            return 0;   //base case2
        }
        int x_Pownm1=calcPower(x,n-1);//kaam
        int xPown=x*xPownm1;
        return xPown;
        
        
        
    }
    public static void main(String[]args){
        int x=2;
        int n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
