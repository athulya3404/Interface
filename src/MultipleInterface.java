interface Printable
{
    void print();
}

interface Scannable
{
    void scan();
}

class Printer implements Printable, Scannable
{
    public void print()
    {
        System.out.println("Printing");
    }

    public void scan()
    {
        System.out.println("Scanning");
    }
}
public class MultipleInterface
{
    public static void main(String[] args)
    {
        Printer p = new Printer();

        p.print();
        p.scan();
    }
}