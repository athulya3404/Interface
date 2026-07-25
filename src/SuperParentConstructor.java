class Animals
{
    Animals()
    {
        System.out.println("Animal Constructor");
    }
}
class Dogs extends Animals
{
    Dogs()
    {
        super();
        System.out.println("Dog Constructor");
    }
}
public class SuperParentConstructor
{
    public static void main(String[] args)
    {
        Dogs d = new Dogs();
    }
}
