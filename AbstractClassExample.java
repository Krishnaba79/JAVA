abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method for calculating area
    public abstract double calculateArea();

    // Abstract method for displaying shape information
    public abstract void displayShape();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShape() {
        System.out.println("Circle - Color: " + color + ", Radius: " + radius + ", Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayShape() {
        System.out.println("Rectangle - Color: " + color + ", Length: " + length + ", Width: " + width + ", Area: " + calculateArea());
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayShape();

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.displayShape();
    }
}
