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
Area a=new Area();
a.setHeight(2);
a.setBreadth(3);
a.setLength(4);
a.setRadius(5);

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
