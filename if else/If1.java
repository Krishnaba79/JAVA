import java.util.Scanner;

public class If1
{
public static void main(String args[])
	{
	int a;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	a=input.nextInt();
	if(a % 2 == 0)	
	{
		System.out.println("the number is even");
	}
	else
	{
		System.out.println("the number is odd");
	}
	}
}