import java.util.*;
class Area{
    private double height;
    private double breadth;
    private double length;
    private double radius;
    void setHeight(double d){height=d;}
    void setBreadth(double d){breadth=d;}
    void setLength(double d){length=d;}
    void setRadius(double d){radius=d;}
    double circle(){return 3.14*radius*radius;}
    double square(){return length*breadth;}
    double rectangle(){return length*breadth;}
    double triangle(){return 0.5*breadth*height;}

}

public class Main{
      public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           double height=sc.nextDouble();
           double breadth=sc.nextDouble();
           double length=sc.nextDouble();
           double radius=sc.nextDouble();
           Area a=new Area();
           a.setHeight(height);
           a.setBreadth(breadth);
           a.setLength(length);
           a.setRadius(radius);

          double circle=a.circle();
          System.out.println(circle);
          double square=a.square();
          System.out.println(square);
          double rectangle=a.rectangle();
          System.out.println(rectangle);
         double triangle=a.triangle();
         System.out.println(triangle);
}
}
