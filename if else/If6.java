import java.util.Scanner;

public class If6
{
public static void main(String args[])
	{
	Float a;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number : ");
	a = input.nextFloat();
	if(a>0)
		{
			System.out.println("your number is positive");
		}
	else if(a<0)
		{
			System.out.println("your number is negative");
		}
	else
		{
			System.out.println("your number is zero");
		}
	}
}