import java.util.Scanner;
class Practice2
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number : ");
int a=input.nextInt();
if(a%2==0)
{ 
System.out.println("The number is Even");
}
else
{
System.out.println("The number is odd");
}
}
}