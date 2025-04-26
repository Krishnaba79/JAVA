public class Fibonacci {
    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Non-recursive function to calculate the nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int fibN = 0;
        int fibMinus1 = 1;
        int fibMinus2 = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibN;
        }

        return fibN;
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to calculate the nth Fibonacci number

        // Using recursive function
        int fibRecursive = fibonacciRecursive(n);
        System.out.println("Fibonacci (Recursive): " + fibRecursive);

        // Using non-recursive function
        int fibNonRecursive = fibonacciNonRecursive(n);
        System.out.println("Fibonacci (Non-Recursive): " + fibNonRecursive);
    }
}