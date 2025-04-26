class Staticexample2
{
static int a=3;
static int b;
static int Max;

static
{
System.out.println("First Static block:");
b = a*4;
}
static
{
System.out.println("Second static block:");
Max = 10;
}
static void math(int x)
{
System.out.println("x=" + x);
System.out.println("a=" + a);
System.out.println("b=" + b);
System.out.println("Max=" +Max);
}
public static void main(String[] args)
{
math(42);
}
}