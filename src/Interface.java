interface Startable
{
    void start();
}

class Cars implements Startable
{
    public void start()
    {
        System.out.println("Car Started");
    }
}

class Bike implements Startable
{
    public void start()
    {
        System.out.println("Bike Started");
    }
}

class Fan implements Startable
{
    public void start()
    {
        System.out.println("Fan Started");
    }
}

class Interface
{
    public static void main(String args[])
    {
        Startable s;

        s = new Cars();
        s.start();

        s = new Bike();
        s.start();

        s = new Fan();
        s.start();

    }
}