import java.util.Scanner;
class Greater
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

		if(a>b && a>c)
		{
			System.out.println("A is Max");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("B is Max");
		}

		else
		{
			System.out.println("C is Max");
		}
	}
}