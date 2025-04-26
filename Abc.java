class Pqr{
void name()
{
System.out.println("lija kasvala");
}
void name(String a)
{
System.out.println("STRING IS:" + a);
}
void name(int no , int Roll_no)gbb
{
System.out.println("no is :" +no);
System.out.println("roll no is:" + Roll_no);
}
}
public class Abc{
public static void main(String [] args)
{
Pqr Obj = new Pqr();
Obj.name();
Obj.name("lija");
Obj.name(21,2000);
}
}