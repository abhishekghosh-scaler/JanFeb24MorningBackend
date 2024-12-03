package DeepVsShallow;

public class Student
{
    private int age;
    private int gradYear;
    Exam enrollmentExam;

    public Student(int age, int gradYear, Exam enrollmentExam)
    {
        this.age = age;
        this.gradYear = gradYear;
        this.enrollmentExam = enrollmentExam;
    }

    public Student(Student other)
    {
        this.age = other.age;
        this.gradYear = other.gradYear;
        //Shallow Copy: copying the reference to the exam variable
        this.enrollmentExam = other.enrollmentExam;

        //Deep copy: creating a different object
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
