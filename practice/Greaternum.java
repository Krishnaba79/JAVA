import java.util.Scanner;
public class Greaternum{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter a first number:");
int numA = input.nextInt();

System.out.print("Enter a second number:");
int numB = input.nextInt();

System.out.print("Enter a third number:");
int numC= input.nextInt();

if(numA>=numB && numA>=numC)
{
System.out.println(numA+"is greater");
}

else if(numB>=numA && numB>=numC)
{
System.out.println(numB+"is greater");
}

else
{
System.out.println(numC+"is greater");
}
}}