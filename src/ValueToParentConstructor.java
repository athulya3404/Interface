class Animalls
{
    String name;
    Animalls(String name)
    {
        this.name = name;
    }
}
class Doggs extends Animalls
{
    Doggs(String name)
    {
        super(name);
    }
    void display()
    {
        System.out.println(name);
    }
}
public class ValueToParentConstructor
{
    public static void main(String[] args)
    {

        Doggs d = new Doggs("Tommy");
        d.display();
    }
}

