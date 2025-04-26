public class NestedTest{
private int x=10;
private static int y=20;
private class NonStatic
{
void display()
{
	System.out.println("private int x= " +x);
}
}
static class StaticNested
{
void display()
{	
	//can't access non-static members here
	//system.out.println("private int x=" +x)

	//can access only the static members 
	System.out.println("private static int = " +y);
}
}
public static void main(String [] args)
{
	NestedTest nc = new NestedTest();
	//instantiation of inner non-static class
	
	NestedTest.NonStatic nonStatic = nc.new NonStatic();
	nonStatic.display();

	//can directly instantiate nested static class
	
	StaticNested staticNested = new StaticNested();
	staticNested.display();
}
}
