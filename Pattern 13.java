
class Pattern{
    public void patternPrint13(){
    
        for(int i=65;i<=70;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
               
                
            }
            
            System.out.println();
           
            
        }
        
    }
    public static void main(String[]args){
        new Pattern().patternPrint13();
    }
    
}

  
