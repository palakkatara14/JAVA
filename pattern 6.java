class Pattern{
    public void Pattern_Print6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        new Pattern().Pattern_Print6(6);
    }
    
    
    
}