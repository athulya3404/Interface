class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
    void displayName()
    {
        System.out.println(name);
    }
}
class Student extends Person
{
    String course;
    Student(String name, String course)
    {
        super(name);
        this.course = course;
    }
    void displayStudent()
    {
        super.displayName();
        System.out.println(course);
    }
}
public class SuperDisplayName
{
    public static void main(String[] args)
    {
        Student s = new Student("Athulya", "BCA");
        s.displayStudent();
    }
}