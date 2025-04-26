class Vehicle{
protected String brand="Ford";
public void honk(){
System.out.println("Hello!");
}
}
class Car1 extends Vehicle{
private String modelName = "world";  //car attribute
public static void main(String [] args){

//create mycar object
Car1 myCar2 = new Car1();

//call the honk() method (frok the vehicle class) on the myCar object
myCar2.honk();

//display the value of the brand attribute (from the vehicle class) and the vaalue of the modelname from the car class
System.out.println(myCar2.brand+" "+myCar2.modelName);
}
}