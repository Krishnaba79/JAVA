class Project2
{
private int x= 10;
private static int y = 20;

private class Nonstatic
{
void display()
{
System.out.println("private int x =" + x);
}
}
static class StaticNested
{
void display()
{
System.out.println("private int y =" + y);
}
}
public static void main(String[] args)
{
Project2 nc = new Project2();
Project2.Nonstatic nonStatic = nc.new Nonstatic();
nonStatic.display();

StaticNested staticNested = new StaticNested();
staticNested.display();

}
}