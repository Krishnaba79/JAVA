import java.util.Scanner;
class Simple9
{ public static void main(String[] args)
{ Scanner input = new Scanner (System.in);
 int n,count=0,a;
String x="";
System.out.println("enter any decimal number:");
 n = input.nextInt();
while(n>0)
{
a=n%2;
if(a==1)
{ count++;
}
x = x + ""+a;
n=n/2;
}
System.out.println("binary number:" + x);
System.out.println("no. of 1s:" + count);
}
}
