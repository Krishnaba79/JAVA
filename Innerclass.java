class OuterClass {
    private int outerVariable = 10;

    // Inner class definition
    public class InnerClass {
        public void display() {
            System.out.println("Inner class display method");
            System.out.println("Outer variable: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();

    }
}