import java.util.Scanner;
class UserinputSum
{
public static void main(String[] args)
{
Double number,Sum = 0.0;
Scanner input = new Scanner(System.in);
while(true)
{
System.out.print("Enter a number:");
number=input.nextDouble();
if(number<0.0)
{
break;
}
Sum += number;
}
System.out.println("Sum="+ Sum);
}
}