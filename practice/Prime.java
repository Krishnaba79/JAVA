import java.util.Scanner;
class Prime{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
int i=0,m=0,flag=0;
System.out.print("Enter a number:");
int n = input.nextInt();
m=n/2;
if(n==0||n==1)
{
System.out.println(n+"is not  prime number");

}
else
{
System.out.println(n+"is  prime number");
}

}}
