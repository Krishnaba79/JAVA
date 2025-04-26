import java.util.Scanner;
class DecimalBinaryConvert{
public static void main(String [] args){
int n,count=0,a;
String x="";
Scanner s=new Scanner(System.in);
System.out.println("enter any decimal number:");
n=s.nextInt();
while(n>0)
{
a=n%2;
if(a==1){
count++;
}
x=x+""+a;
n=n/2;
}
System.out.println("Binary number:"+x);
System.out.println("no. of 1s:"+countb);
}}
