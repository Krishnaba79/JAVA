import java.util.Scanner;
class Multiply
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number 1:");
		int no=input.nextInt();
		System.out.println("Enter a number 2:");
		int no1=input.nextInt();
		System.out.println("Multiplication of two no is:" + (no*no1));
	}
}