class Animall
{
    Animall()
    {
        System.out.println("Animal");
    }
}
class Dogg extends Animall
{
    Dogg()
    {
        System.out.println("Dog");
    }
}
public class ConstructorChaining
{
    public static void main(String[] args)
    {
        Dogg d = new Dogg();
    }
}
