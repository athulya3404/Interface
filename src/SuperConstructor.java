class Vehicle
{
    String brand;
    Vehicle(String brand)
    {
        this.brand = brand;
    }
    void displayVehicle()
    {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle
{
    String model;
    Car(String brand, String model)
    {
        super(brand);
        this.model = model;
    }
    void displayCar()
    {
        displayVehicle();
        System.out.println("Model: " + model);
    }
}
public class SuperConstructor
{
    public static void main(String[] args)
    {
        Car c = new Car("Toyota", "Corolla");
        c.displayCar();
    }
}