// Define an interface
interface Printable {
    void print();
}

// Define an abstract class that implements the Printable interface
abstract class AbstractClass implements Printable {
    // Implement the print() method from the Printable interface
    public void print() {
        System.out.println("Printing from AbstractClass");
    }

    // Declare an abstract method that must be implemented by subclasses
    abstract void doSomething();
}

// Create a concrete class that extends the AbstractClass
class MyClass extends AbstractClass {
    // Implement the doSomething() method declared in the AbstractClass
    void doSomething() {
        System.out.println("Doing something in MyClass");
    }
}

class InterfaceImplement {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObj = new MyClass();

        // Call the print() method inherited from the Printable interface
        myObj.print();

        // Call the doSomething() method implemented in MyClass
        myObj.doSomething();
    }
}