import java.util.Scanner;
class  addtwonum
{
public static void main(String[ ] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the frist number: ");
double num1 = input.nextDouble();
System.out.print("Enter the second number: ");
double num2 = input.nextDouble();
double sum = num1 + num2;
System.out.print("The sum of " + num1 +" and " + num2 + " is " + sum);
}
}