import java.util.*;
class Area{
    void area_of_circle(double r){
        double area1=0.5*r*r;
        System.out.println(area1);
    }
    void area_of_rectangle(int l,int b){
        int area=l*b;
        System.out.println(area);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a=new Area();
        a.area_of_circle(r);
        a.area_of_rectangle(l,b);
        
    }
}