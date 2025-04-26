import java.util.*;
class Calculation 
{
   int z;
	
   public void addition(int x, int y) 
{
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) 
{
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class My_Calculation extends Calculation 
{
   public void multiplication(int x, int y) 
{
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) 
{
Scanner s = new Scanner(System.in);
System.out.println("ENter the value of a:");
int a= s.nextInt();
System.out.println("ENter the value of b:");
int b= s.nextInt();

  //int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}