import java.util.Scanner;
class Practice1
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter your number:");
int a=input.nextInt();
if(a < 0)
{
System.out.println("The number is Negative");
}
else
{ 
System.out.println("The number is positive");
}

}
}