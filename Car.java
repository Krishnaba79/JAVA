public class Car
{
int modelYear;
String modelName;

public Car(int year , String name)
{
modelYear = year;
modelName = name;
}

public void MyMethod()
{
System.out.println("public methods must be called by creating object");
}

public static void main(String [] args)
{
Car myCar = new Car(1969 , "Mustang");

System.out.println(myCar.modelYear + " " + myCar.modelName);
myCar.MyMethod();
}}




