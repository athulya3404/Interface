class Personn
{
    String name;
    Personn(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println("Name: " + name);
    }
}
class Faculty extends Personn
{
    String department;
    Faculty(String name, String department)
    {
        super(name);
        this.department = department;
    }
}
class Professor extends Faculty
{
    String specialization;
    Professor(String name, String department, String specialization)
    {
        super(name, department);
        this.specialization = specialization;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }
}
public class UniversityHierarchy
{
    public static void main(String[] args)
    {
        Professor p = new Professor("Dr. Anitha", "Computer Science", "Artificial Intelligence");
        p.display();
    }
}