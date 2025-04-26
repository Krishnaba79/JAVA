import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the No:");
		int no=input.nextInt();

		if(no%2==0)
		{
			System.out.println("Given no is Even");
		}
		else
		{
			System.out.println("Given no is Odd");
		}
	}
}