import java.util.Scanner;
class javaExample
{
public static void main(String[] args)
{
//We will find the factorial of this number
int number;
System.out.println("Enter the number:");
Scanner scanner=new Scanner(System.in);
number=scanner.nextlnt();
scanner.close();
longfact=1;
int i=1;
while(i<number)
{
fact=fact*i;
i++;
}
System.out.println("Factorial of"+number+"is:"+fact);}
}
}