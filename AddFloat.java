import java.util.Scanner;
class AddFloat
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first Float No:");
		float number=input.nextFloat();
		System.out.println("Enter second Float No:");
		float number1=input.nextFloat();
		System.out.println("Addition of two float no is:" + (number + number1));


		System.out.println("Enter first Double No:");
		double no=input.nextDouble();
		System.out.println("Enter second Double No:");
		double no1=input.nextDouble();
		System.out.println("Addition of two Double no is:" + (no + no1));
	}
}