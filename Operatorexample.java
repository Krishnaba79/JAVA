class Operatorexample
{
	public static void main(String[] args)
	{
			int x=10;

// java unary operator Example ++ and -- 

			System.out.println(x++);  // 10(11)
			
			System.out.println(++x);  // 12

			System.out.println(x--);  //12(11)

			System.out.println(--x);  //10

System.out.println("--------------------------------");

 			
			int a=10;

			int b=10;

			System.out.println(a++ + ++a); //10+12 =22

			System.out.println(b++ + ++b); // 10+11=21



System.out.println("example :------- ~ and ! " );


int y=10;

int z=10;

boolean m = true;
 
boolean n = false;

		System.out.println(~y); //-11

		System.out.println(~z); //9

		System.out.println(!m); //false ( opposite of boolean value)

		System.out.println(!n); //true

							
	}
}