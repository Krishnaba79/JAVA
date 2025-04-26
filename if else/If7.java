import java.util.Scanner;

public class If7
{
public static void main(String args[])
	{
	Float a,b;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter yor age a : ");
	a=input.nextFloat();
	System.out.println("Enter yor weight b : ");
	b=input.nextFloat();
	if(a>=18){
		if(b>50)
		{
			System.out.println("you can donate blood");
		}
		else
		{	
			System.out.println("your weight is 50 or greater than 50");
		}
		}
	else
		{
			System.out.println("you age id not 18");
		}
	}
}
		
