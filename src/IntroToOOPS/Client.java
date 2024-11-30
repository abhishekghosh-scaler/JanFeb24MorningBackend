package IntroToOOPS;

public class Client
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setPsp(50);
        student.name = "Abhishek";

        student.attendClass();
//        System.out.println(student.getPsp());

        Student student2 = new Student();
        student2.name = "Abhishek";
//        student2.attendClass();

        student2 = student;
//        student2.attendClass();
    }
}
