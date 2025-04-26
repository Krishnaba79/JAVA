import java.util.Scanner;
class Multi
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter the Value of A:");
		float a=input.nextFloat();

		System.out.println("Enter the Value of B:");
		float b=input.nextFloat();

		System.out.println("Multiplication of Two no is: "+ (a*b));
	}
}