class Pattern{
    public void Pattern_Print5(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        new Pattern().Pattern_Print5(6);
    }
    
    
    
}