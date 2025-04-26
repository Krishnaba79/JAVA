import java.util.Scanner;
public class JavaFactorial
{
	public static void main(String[] args)
	{
		int number;
		System.out.println("Enter the Number:");
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		scanner.close();
		long fact=1;
		int i=1;
		while(i<=number)
		{
			fact=fact*i;	
			i++;
		}
	
		System.out.println("Factorial of given number is: "+ fact); 
	}
}