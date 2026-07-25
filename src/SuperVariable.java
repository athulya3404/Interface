class Employee
{
    String company = "TCS";
}

class Developer extends Employee
{
    String company = "Infosys";
    void display()
    {
        System.out.println("Developer Company: " + company);
        System.out.println("Employee Company: " + super.company);
    }
}
public class SuperVariable
{
    public static void main(String[] args)
    {
        Developer d = new Developer();
        d.display();
    }
}