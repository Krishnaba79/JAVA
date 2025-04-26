public class Constructor
{
 public Constructor(String name)
{
//this constructor has one parameter,name.
 System.out.println("Passed Name is:"+name);
}
 public static void main(String args[])
{
//following statement would create an object
 Constructor c=new Constructor("Hello");
}
}