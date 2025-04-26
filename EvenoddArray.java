//print even odd elements from an array
import java.util.Scanner;
public class EvenoddArray{
public static void main(String[]args)
{
int n;
Scanner s=new Scanner(System.in);

System.out.println("enter no. of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];

System.out.println("enter all the element:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}

System.out.println("odd numbers in the array are:");
for(int i=0;i<n;i++)
{
if(a[i]%2!=0)
{
System.out.print(a[i]+" ");
}
}
System.out.println("");
System.out.print("even numbers in the array are:");
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
System.out.print(a[i]+" ");
}
}
}}