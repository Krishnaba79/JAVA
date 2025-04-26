import java.util.Scanner;

public class If5
{
public static void main(String args[]);
	{
	Float a,b;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the age");
	a = input.nextFloat;
	System.out.println("Enter the weight");
	b = input.nextFloat;
	if(a>=18){
		if(b>50)
		{
			System.out.println("You can donate blood");
		}
		else
		{
			System.out.println("You can not donate blood");
		}
	}
	else
		{
			System.out.println("Your age is not 18");
		}
	}
}
	
