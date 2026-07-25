class Employees
{
    void display()
    {
        System.out.println("Employee Display");
    }
}
class Developers extends Employees
{
    @Override
    void display()
    {
        super.display();
        System.out.println("Developer Display");
    }
}
public class SuperMethod
{
    public static void main(String[] args)
    {
        Developers d = new Developers();
        d.display();
    }
}