class Student{
    String name="Jaswanth";
    int rollno=1;
    float age=17.5f;
    String course="B.Tech";
    double marks=100;
}
public class StudentDisplay{
    public static void main(String args[]){
        Student s1=new Student();
        System.out.println("Name: "+s1.name);
        System.out.println("Roll No: "+s1.rollno);
        System.out.println("Age: "+s1.age);
        System.out.println("Course: "+s1.course);
        System.out.println("Marks: "+s1.marks);
    }
}