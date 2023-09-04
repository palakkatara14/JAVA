class Pattern{
    public void Pattern_Print2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        new Pattern().Pattern_Print2(5);
    }
    
    
    
}