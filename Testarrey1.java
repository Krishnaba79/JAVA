//java program to illustrate the use of decleration, instantation
//and initialization of java arrey in a single line

class Testarrey1
	{
	public static void main(String [] args)
	{
		int a[]={33,3,4,5};//decleration , indentation and initialization
		String[] cars={"Ford","Volvo","AUDI","BMW"};
		cars[0] = "Opel";
		//printing arrey
			for (int i=0;i<a.length;i++)//leangth is the property of arrey
				System.out.println(a[i]);
				System.out.println(cars[0]);
				System.out.println(cars.length);
		}
}