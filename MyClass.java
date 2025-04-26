public class MyClass
{
	int x,y; //create class attribute

//create a class constructor for the constructor2 class
public  MyClass()
{
	x = 0;
	 y=0;  //set the intial value for the attribute x
}

public MyClass(int a,int b)
{
	x=a;
	y=b;
}

public static void main(String [] args)
{
	MyClass  myObj = new MyClass(); //create an object of class Constructor2
	System.out.println(myObj.x); //print the value of x
	System.out.println(myObj.y);
	MyClass myObj1 = new MyClass(10,20);
	System.out.println(myObj1.x);
	System.out.println(myObj1.y);
}
}