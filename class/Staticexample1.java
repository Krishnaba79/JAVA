class Staticexample1
{
static int num;
static String mystr;

static
{
System.out.println("Static block 1");
num = 68;
mystr = "Block1";
}

static
{
System.out.println("Static block 2");
num = 98;
mystr = "Block2";
}
public static void main(String[] args)
{
System.out.println("Valuee of num:" + num);
System.out.println("Valuee of mystr:" + mystr);
}

}