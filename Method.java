public class Method{
public void speed(){
System.out.println("the car is going as fast as it can!");
}

//create A speed() method and add a parameter
public void (int maxSpeed) {
System.out.println("Max speed is:" + maxSpeed);
}

//inside main , call the methods on the Method object
public static void main(String [] args){
Method myMethod=new Method();  // create a myMethod object
myMethod.speed(); //call the fullThrottle() method
myMethod.speed(200);  //call the speed() method
}
}