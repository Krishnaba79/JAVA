public class EqualCheck
{
public static void main(String args[])
 {
   String a="AVTAR";
   String b="avtar";

   if(a.equals(b))
   {
   System.out.println("Both string are equal.");
   }
   else
   {
   System.out.println("Both string are not equal");
   }

   if(a.equalsIgnoreCase(b))
   {
   System.out.println("Both string are equal.");
   }
   else
   {
   System.out.println("both string are not equal");
   }
 }
}