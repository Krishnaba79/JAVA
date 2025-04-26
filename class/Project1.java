class Project1
{
private static String str="hello book";
static class MyNestedClass
{
public void disp()
{
System.out.println(str);
}
}
public static void main(String[] args)
{ 
Project1.MyNestedClass obj = new Project1.MyNestedClass();
obj.disp();

}
}