import java.util.Scanner;

																		
class Ifsinput
{
	public static void main(String[] args)
	{
			Integer a;
			
			String b;

			Float c;

			Scanner input= new Scanner(System.in);

			System.out.print(" Enter your integer number :");

			 a =input.nextInt();

			System.out.println("Your int number is "+a );




			System.out.print(" Enter your name :");

			 b =input.nextLine();

			System.out.println("Your name is"+b );



			System.out.print(" Enter a float number:");

			 c =input.nextFloat();

			System.out.println("Your number is "+ c );
					
							
	}
}