import java.util.*;
public class main
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int number");

		int a=sc.nextInt();
		//	  sc.nextLine();
		System.out.println("Enter String ");
		String s = sc.nextLine();
		System.out.println("Enter double number");
		
		double d=sc.nextDouble();
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(d);
	}
}