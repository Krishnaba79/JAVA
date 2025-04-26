import java.util.Scanner;

class Simple2
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter a string:");
String str = input.nextLine();
System.out.println("input String is:" + str);

System.out.println("Enter the integer");
int number = input.nextInt();
System.out.println("you entered " + number);

System.out.println("enter the second number");
int number1 = input.nextInt();
System.out.println("you entered " + number1);
System.out.println(number +number1);
}
}