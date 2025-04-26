public class OuterClass {
    private int outerVariable = 10;

    // Inner class definition
    public class InnerClass {
        public void display() {
            System.out.println("Inner class display method");
            System.out.println("Outer variable: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Create an instance of the inner class using the outer object
        InnerClass innerObj = outerObj.new InnerClass();

        // Call the display method of the inner class
        innerObj.display();
    }
}