import java.util.Scanner;

public class Arrayevenodd
{
public static void main(String[] args)
{
//intialization and creating object
int n;
Scanner s=new Scanner(System.in);

//enter number for elements.
System.out.print("Enter no. of elements you want in array:");
n = s.nextln();
int a[]=new int[n];

//enter all element
System.out.println("enter all the element:");
for (int i=0;i<n;i++)
{
a[i]=s.nextint();
}
System.out.println("Odd numbers in the array are:");
for(int i=0;i<n;i++)
{
if(a[i]%2 == 0)
{
System.out.println
