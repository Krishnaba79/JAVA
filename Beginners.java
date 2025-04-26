import java.util.Scanner;
public class Beginners
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println(a);
        int b = input.nextInt();
        System.out.println(b);
        int sum = a+b;
        System.out.println(sum);
    }
}
