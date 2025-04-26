import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        System.out.println(str);

        System.out.println("Enter a Number");
        int a = input.nextInt();
        System.out.println(a);

        System.out.println("Enter a Number");
        int b = input.nextInt();
        System.out.println(b);
        System.out.println("sum of the number:");
        System.out.println(a+b);
        System.out.println("subtraction of the number:");
        System.out.println(a-b);
        System.out.println("multiplaction of the number:");
        System.out.println(a*b);
        System.out.println("division of the number:");
        System.out.println(a/b);


    }
}