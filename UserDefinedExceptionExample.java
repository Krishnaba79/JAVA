// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
// Example usage of the custom exception
public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            // Throw the custom exception
            throw new MyCustomException("This is a custom exception");
        } catch (MyCustomException e) {
            // Catch the custom exception and handle it
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}