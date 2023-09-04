
class Pattern{
    public void patternPrint16(){
    
        for(int i=0;i<5;i++){
            int print=5;
            for(int j=0;j<=i;j++){
                System.out.print(print+" ");
                print=print-1;
               
                
            }
            
            System.out.println();
           
            
        }
        
    }
    public static void main(String[]args){
        new Pattern().patternPrint16();
    }
    
}

  
