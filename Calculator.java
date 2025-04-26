import java.util.Scanner;
class Calculator
{	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);

		System.out.println("1.Addition");	
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println("Enter your choice");
		int choice=input.nextInt();
	
		if(choice==1)
		{
			System.out.println("You've Selected Addition");
			System.out.println("Enter the First No:");
			int no=input.nextInt();
			System.out.println("Enter the Second No:");
			int no1=input.nextInt();
			System.out.println("Addition of two no is:" + (no+no1));
		}

		else if(choice==2)
		{
			System.out.println("You've Selected Subtraction");
			System.out.println("Enter the First No:");
			int no=input.nextInt();
			System.out.println("Enter the Second No:");
			int no1=input.nextInt();
			System.out.println("Subtraction of two no is:" + (no-no1));
		}

		else if(choice==3)
		{
			System.out.println("You've Selected Multiplication");
			System.out.println("Enter the First No:");
			int no=input.nextInt();
			System.out.println("Enter the Second No:");
			int no1=input.nextInt();
			System.out.println("Multiplication of two no is:" + (no*no1));
		}

		else if(choice==4)
		{
			System.out.println("You've Selected Division");
			System.out.println("Enter the First No:");
			int no=input.nextInt();
			System.out.println("Enter the Second No:");
			int no1=input.nextInt();
			System.out.println("Division of two no is:" + (no/no1));
		}

		else
		{
			System.out.println("Invalid Choice");
		}
	}
}