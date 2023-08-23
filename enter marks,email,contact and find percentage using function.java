import java.util.*;
public class Student {
    String name;
    long contac_no;
    String email_id;
    int marks1;
    int marks2;
    int marks3;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your name");
        name=sc.nextLine();
        System.out.println("Eneter Your Contact Number");
        contac_no=sc.nextLong();
        System.out.println("Email Id");
        email_id=sc.nextLine();
        System.out.println("Enter your marks");
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();        
    }
    void display(){
        System.out.println(name);
        System.out.println(contac_no);
        System.out.println(email_id);
        System.out.println((marks1+marks2+marks3)/3.0);
    }
    public static void main(String args[]){
        Student s=new Student();
        s.get();
        s.display();

}
}
