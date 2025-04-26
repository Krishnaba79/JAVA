class Staticexample
{
static int num;
static String mystr;
static
{
num=97;
mystr = "Ststic keyword in java";
}
public static void main(String[] args)
{
System.out.println("Value of num:" + num);
System.out.println("Value of mystr" + mystr);
}
}