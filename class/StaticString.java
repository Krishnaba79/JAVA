class StaticString
{
static int var1;
static String var2; 
static void dip()
{
System.out.println("var1 is :" + var1);
System.out.println("var2 is :" + var2);
}
public static void main(String[] args)
{
var1 = 5;
var2 = "dharm";
dip();
}
}