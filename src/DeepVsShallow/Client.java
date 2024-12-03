package DeepVsShallow;

public class Client
{
    public static void main(String[] args) {
        Exam exam = new Exam(101, 95);
        Student st1 = new Student(25, 2005, exam);

        System.out.println(st1.getAge());

        Student st2 = new Student(st1);
        System.out.println(st2.getAge());
    }
}
