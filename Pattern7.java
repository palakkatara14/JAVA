class Pattern{
    public void Pattern_Print7(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        new Pattern().Pattern_Print7(5);
    }
    
    
    
}