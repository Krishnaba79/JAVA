import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
char operator;

System.out.print("Enter frist number:");
num1=sc.nextlnt();

System.out.print("Enter second number:");
num2=sc.nextlnt();

System.out.print("Enter operator(+,-,*,/):");
operator = sc.next().charAt(0);

Switch(operator);
{
case'+':
result = num1+num2;
break;

case'-':
result = num1-num2;
break;

case'*':
result = num1*num2;
break;

case'/':
result = num1/num2;
break;

default:
System.out.println("invalid operator!");
return;
}
System.out.println(num1+" "+operator+" "+num2+"="+result);
}
}