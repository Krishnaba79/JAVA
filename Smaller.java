import java.util.Scanner;
class Smaller
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Value of A:");	
		int a=input.nextInt();
		
		System.out.println("Enter the Value of B:");	
		int b=input.nextInt();

		System.out.println("Enter the Value of C:");	
		int c=input.nextInt();

		if(a<b && a<c)
		{
			System.out.println("A is Min");
		}
		
		else if(b<a && b<c)
		{
			System.out.println("B is Min");
		}

		else
		{
			System.out.println("C is Min");
		}
	}
}