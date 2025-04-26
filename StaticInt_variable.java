class StaticInt_variable{
//static integer variable 
static int var1 = 77;
//non-static string variable
String var2;

public static void main(String [] args )
{
StaticInt_variable ob1= new StaticInt_variable();
StaticInt_variable ob2 =new StaticInt_variable();
StaticInt_variable ob3 =new StaticInt_variable();

//assigning tha value to static variable using object on1
ob1.var1 = 88;
ob1.var2 = "i'm Object1";

//this will overwrite the value of var1 because var1 has a single copy shared mong both the objects.

ob2.var1 = 99;
ob2.var2="i'm Object2";

ob3.var2 = "i'm  Object3";
ob3.var1 = 50;

System.out.println("ob1 integer:" + ob1.var1);
System.out.println("ob1 string:" + ob1.var2);
System.out.println("ob2 integer:" + ob2.var1);
System.out.println("ob1 string:" + ob2.var2);
System.out.println("ob2 string:" + ob3.var1);
System.out.println("ob2 string:" + ob3nn.var2);

}
}
