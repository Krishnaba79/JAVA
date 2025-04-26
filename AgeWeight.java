import java.util.Scanner;
class AgeWeight
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Weight:");
		int weight=input.nextInt();

		System.out.println("Enter Age:");		
		int age=input.nextInt();

		if(age>18 || weight>50)
		{
			System.out.println("You Can Donate Blood");
		}
	
		else
		{
			System.out.println("You Can't Donate Blood");
		}
	}
}