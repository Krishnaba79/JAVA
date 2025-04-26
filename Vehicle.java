public class Vehicle
{
    protected String brand = "ford";
    public void honk()
    {
        System.out.println("Hello!");
    }
}

class Car extends Vehicle
{
    private String modelName = "World";
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
