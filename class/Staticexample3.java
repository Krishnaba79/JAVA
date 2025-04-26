class Staticexample3
{
int instVar;
Staticexample3(int instVar)
{
this.instVar = instVar;
System.out.println("this reference = " + this);
}
public static void main(String[] args)
{
Staticexample3 obj = new Staticexample3(8);
System.out.println("object reference = " + obj);
}
}