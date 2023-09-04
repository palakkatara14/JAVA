
class Pattern{
    public void patternPrint19(int n,int m){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==n||j==m||i==1||j==1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
}



public static void main(String []args){
    new Pattern().patternPrint19(5,4);
}

   

}