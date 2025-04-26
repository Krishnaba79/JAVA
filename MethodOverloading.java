public class MethodOverloading {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Alice", 25);

        // Calling methods with different parameters
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        person1.greet();
        person2.greet("Hello");
        person3.greet("Hi", 3);
    }
}

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void greet() {
        System.out.println("Hello! Nice to meet you!");
    }

    public void greet(String greeting) {
        System.out.println(greeting + " " + name + "!");
    }

    public void greet(String greeting, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(greeting + " " + name + "!");
        }
    }
}
