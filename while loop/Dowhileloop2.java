import java.util.Scanner;
class Dowhileloop2
{ public static void main(String[] args)
{
Double number,sum=0.0;
Scanner input = new Scanner(System.in);
do
{ System.out.println("enter a number:");
number = input.nextDouble();
sum += number;
}
while(number !=0.0);
System.out.println("sum = " + sum);
}
}