import java.util.Scanner;
public class FindFactorial
{
public static void main(String args[])
	{	
	//we will find factorial of this number
	int number;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	number=input.nextInt();
	input.close();
	long fact=1;
	int i = 1;
	while(i<=number)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("Factorial of "+number+" is:"+fact);
	}
}
	