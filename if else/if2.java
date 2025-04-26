import java.util.Scanner;

public class If2
{
public static void main(String args[])
	{
	int a,b,c;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first number a:");
	a = input.nextInt();
	System.out.println("Enter the Second number b:");
	b = input.nextInt();
	System.out.println("Enter the third number c:");
	c = input.nextInt();
	if(a>b)
		if(a>c)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	else
		if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
			