import java.util.Scanner;
class Nestedif{
public static void main(String []  args){
Scanner input=new Scanner(System.in);
System.out.println("enter weight:");
int weight=input.nextInt();

System.out.println("enter Age:");
int Age=input.nextInt();

if(weight<40)
{
System.out.println("you can Donate Blood");
}
else if(Age>=18)
{
System.out.println("you can Donate Blood");
}
else
{
System.out.println("You can't Donate Blood");
}
}}