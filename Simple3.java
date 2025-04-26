import java.util.Scanner;

class Simple3
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);

System.out.println("Enter the string:");
String str = input.nextLine();
System.out.println(str);

System.out.println("Enter a number:");
int z = input.nextInt();
System.out.println(z);

System.out.println(str + z);

System.out.println("Enter the First number:");
int a = input.nextInt();
System.out.println("The First number is :" + a);

System.out.println("Enter the Second  number:");
int b = input.nextInt();
System.out.println("The Second  number is " + b);

System.out.println("The Sum of the number1 + number2 is:");
System.out.println(a+b);


}
}