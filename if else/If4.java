import java.util.Scanner;

public class If4
{
public static void main(String args[])
	{
	int a;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the marks :");
	a = input.nextInt();
	
	if(a>=90)
	{
		System.out.println("Grade A+");
	}
	else if(a>=80)
	{
		System.out.println("Grade A");
	}
	else if(a>=70)
	{
		System.out.println("Grade B");
	}
	else if(a>=60)
	{
		System.out.println("Grade C");
	}
	else if(a>=34)
	{
		System.out.println("Grade D");
	}
	else if(a<34)
	{
		System.out.println("fail");
	}
	}
}