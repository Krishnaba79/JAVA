import java.util.Scanner;
class Simple11
{ public static void main(String[] args)
{ 
int number;
Scanner input = new Scanner(System.in);
System.out.println("enter a number:");
number = input.nextInt();
long fact = 1;
int i=1;
while(i<=number)
{ fact = fact*i;
i++;
}
System.out.println("factorial of "+ number + "is :" + fact);
}
}
