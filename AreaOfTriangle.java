import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);		
		System.out.println("Enter the Base:");
		float base=input.nextFloat();
		System.out.println("Enter the Height:");
		float height=input.nextFloat();
		System.out.println("Area of Triangle is:" + (base*height)/2);
	}
}