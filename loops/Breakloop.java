import java.util.Scanner;
class Breakloop
{
public static void main(String[] args)
{
int n;
Scanner input=new Scanner(System.in);
while(true)
{
System.out.println("input an integer");
n=input.nextInt();
if(n!=0)
{
System.out.println("you have enterd:"+n);
continue;
}
else
{
break;
}
}
}
}









