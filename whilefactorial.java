import java.util.Scanner;
public class JavaExample{
public static void main(String[] args){
// We will find the factorial of this number
Int number;
System.out.println("Enter the number : ");

Scanner scanner= new Scanner(System.In);
number = scanner.nextInt();
long fact = 1;
while(i<=number)
{
fact = fact*i;
i++;
}
System.out.println("Factorial of " + number + " is :"+fact);
}
}