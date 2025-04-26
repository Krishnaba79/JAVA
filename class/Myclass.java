/*public class Myclass
{
int x,y;

	public Myclass()
	{
		 x=0;
		y=0;
	}
	public Myclass(int a,int b)
	{ 
		x = a;
		y=b;
	}

	public static void main(String[] args)
	{
		Myclass myObj=new Myclass();
		Myclass myObj1 = new Myclass(10,20);
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println(myObj1.x);
		System.out.println(myObj1.y);
	}


}*/


public class Myclass
{
int  modelYear;
String modelName;

public Myclass(int year , String name)
{
modelYear = year;
modelName=name;
}
public void Mymethod()
{
System.out.println("public method must be called by creating objects");
}
public static void main(String[] args)
{
Myclass MyCar=new Myclass(1969,"Mustang");
System.out.println(MyCar.modelYear + " " + MyCar.modelName );
MyCar.Mymethod();
}
}
























