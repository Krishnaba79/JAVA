import java.util.Scanner;
class PosNeg{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("enter a value:");
int number=input.nextInt();
if(number<0.0)
{
System.out.println(number+" is a Negative value");
}
else
{
System.out.println(number + " is a positive value");
}
}}