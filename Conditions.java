import java.util.Scanner;
class Conditions
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int button= sc.nextInt( );
switch(button)
{
case 1 : System.out.println("hello");
break;
case 2 : System.out.println("namste");
break;
case 3: System.out.println("nam");
break;
default: System.out.println("invalid");
break;
}
}
}