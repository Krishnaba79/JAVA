class StaticMethod
{
static int var1=77;
String var2;

public static void main(String[] args)
{
StaticMethod ob1 = new StaticMethod();
StaticMethod ob2 = new StaticMethod();
StaticMethod ob3 = new StaticMethod();

ob1.var1 = 88;
ob1.var2 = "i'm Object1";

ob2.var1 = 99;
ob2.var2 =  "i'm Object2";

ob3.var2="i'm Object3";
ob3.var1=50;

System.out.println("ob1 integer:" + ob1.var1);
System.out.println("ob1 String:" + ob1.var2);
System.out.println("ob2 integer:" + ob2.var1);
System.out.println("ob2 String:" + ob2.var2);
System.out.println("ob2 integer:" + ob3.var1);
System.out.println("ob2 String:" + ob3.var2);

}
}