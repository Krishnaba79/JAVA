public class EqualCheck{

  public static void main(String args[])
 {
    String a="AVater";
    String b="avater";

   if(a.equals(b))
{
     System.out.println("Both String are equal");
   } 
else 
{
 	  System.out.println("Both String are not equal");
}

if(a.equalsIgnoreCase(b))
{
    System.out.println("Both the Strings are equal");
} 
else
{
	System.out.println("Both the Strings are not equal");
}
}
}