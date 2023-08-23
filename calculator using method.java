import java.util.*;
class Calculator{
    private double n1 ;
    private double n2;

    void setN1(double d){n1=d;}
    void setN2(double d){n2=d;}

    double add(){return n1+n2;}
    double subtract(){return n1-n2;}
    double multiply(){return n1*n2;}
    double divide(){return 0.5*n1/n2;}

}

public class Main{
     public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           double n1=sc.nextDouble();
           double n2=sc.nextDouble();
           Calculator c=new Calculator();
           c.setN1(n1);
           c.setN2(n2);


          double add=c.add();
          System.out.println(add);
          double subtract=c.subtract();
          System.out.println(subtract);
          double multiply=c.multiply();
          System.out.println(multiply);
          double divide=c.divide();
          System.out.println(divide);
}
}
