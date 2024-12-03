package Static;

public class Student
{
    private int age;
    private int gradYear;
    static int count;
    int id;
    int non_static_count;

    public Student(int age, int gradYear)
    {
        this.age = age;
        this.gradYear = gradYear;
        count++;
        non_static_count++;
        id = count;
    }

    // Able to access a static variable from a non-static block
    public int getCount()
    {
        count++;
        return count;
    }

    //Static method can't access non-static objects/variables
    public static void doSomething()
    {
        // age += 10;
    }

    public static int getAgeofAnyStudent()
    {
        // return age;
        return 0;
    }
}
