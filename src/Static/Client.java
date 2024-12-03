package Static;

public class Client
{
    public static void main(String[] args) {
        System.out.println(Student.count);

        System.out.println(Student.getAgeofAnyStudent());

        Student st1 = new Student(25, 1975);
        Student st2 = new Student(25, 1975);
        Student st3 = new Student(25, 1975);
        Student st4 = new Student(25, 1975);
        Student st5 = new Student(25, 1975);

        System.out.println(st5.non_static_count);
        System.out.println(st5.id);
        System.out.println(Student.count);

//        Math.log(10);
    }
}
