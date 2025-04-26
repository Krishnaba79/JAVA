class demo
{
	public demo(String name)
	{
		System.out.println("Name is: "+name);
	}
	/*public demo()
	{
		System.out.println("Default Constructor");
	}
	public demo(int a)
	{
		System.out.println("Value of A is: "+a);
	}
	public demo(int b,int c)
	{
		System.out.println("Value of B is: "+b);
		System.out.println("Value of C is: "+c);
	}*/
}

public class Constructor1
{
	public static void main(String args[])
	{
		demo obj=new demo("Hiral");
		/*demo obj1=new demo();
		demo obj2=new demo(12);
		demo obj3=new demo(13,14);*/
	}
}