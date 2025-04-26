public class MultipleTryCatchFinally {
    public static void main(String[] args) {
        try {
            tryBlockOne();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Inside outer finally block");
        }
    }

    public static void tryBlockOne() {
        try {
            tryBlockTwo();
            System.out.println("After calling tryBlockTwo()");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Inside tryBlockOne() finally block");
        }
    }

    public static void tryBlockTwo() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Inside tryBlockTwo() finally block");
        }
    }
}