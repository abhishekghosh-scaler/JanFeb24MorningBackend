package Constructors;

public class Client
{
    public static void main(String[] args) {
        Student st1 = new Student(25, 1945);

        System.out.println(st1.getAge());
        System.out.println(st1.getGradYear());

        Student st2 = new Student(st1);
        System.out.println(st2.getAge());
        System.out.println(st2.getGradYear());
    }
}
