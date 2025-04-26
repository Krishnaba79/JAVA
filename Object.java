class student1
{
	int id;
	String name;
}
public class Object
{
	public static void main(String args[])
	{
		student1 obj=new student1();
		student1 obj1=new student1();
		System.out.println(obj.id);
		System.out.println(obj.name);

		obj1.id=12;
		obj1.name="Hiral";

		System.out.println(obj1.id);
		System.out.println(obj1.name);
	}
}