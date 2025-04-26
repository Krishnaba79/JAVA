import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
int number;
System.out.println("Enter the number:");
Scanner Scanner = new Scanner(System.in);
number = Scanner.nextInt();
Scanner.close();
long fact=1;
int i=1;
while(i<=number)
{
fact =fact*i;
i++;
}
System.out.println("Factorial of "+number+" is:"+fact);
}
}