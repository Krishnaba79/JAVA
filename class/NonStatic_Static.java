class NonStatic_Static
{
static int i=100;
static String s= "Beginbook";

static void display()
{
System.out.println("i:" + i);
System.out.println("s:" + s);
}

void funcn()
{
display();
}

public static void main(String[] args)
{
NonStatic_Static obj = new NonStatic_Static();
obj.funcn();
obj.display();
}

}
