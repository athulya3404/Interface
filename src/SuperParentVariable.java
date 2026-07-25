class Animalss {

    String name = "Animal";
}
class Dogss extends Animalss {

    String name = "Dog";

    void display() {

        System.out.println(name);

        System.out.println(super.name);
    }
}
public class SuperParentVariable
{
    public static void main(String[] args)
    {
        Dogss d = new Dogss();
        d.display();
    }
}

