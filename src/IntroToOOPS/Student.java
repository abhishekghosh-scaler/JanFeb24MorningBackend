package IntroToOOPS;

//outer class should only be public
//inner class can be private -> Builder Design Pattern
public class Student
{
    public String name;
    public int age;
    int gradYear;
    private int psp;

    //Constructor is usually public, save a few cases
    //private constructor -> Singleton
    public Student()
    {
        name = "new student";
        age = 20;
        gradYear = 2020;
        psp = 100;
    }

    void attendClass()
    {
        System.out.println("Student " + name + " is attending class");
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int pspVar) {
        if(pspVar < 0 || pspVar > 100)
        {
            throw new RuntimeException("Invalid PSP");
        }

        psp = pspVar;
    }
}

// Access Modifiers
// Public: The current detail is available everywhere
// Default: This is accessible only within the same package
// Protected: Accessible only within the same package + children anywhere
// Private: Only accessible within the same class
