import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		float r=input.nextFloat();
		float pie=3.14f;
		System.out.println("Area of Circle is:" + (r*r*pie));
	}
}