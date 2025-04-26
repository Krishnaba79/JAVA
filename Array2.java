//java program to illustrate how to declare,instantiate,intilize and traverse 
class Array2{
public static void main(String args[])
{
int a[]=new int[5];//declaration and instantiation
a[0]=10;//intialization
a[1]=20;
a[2]=70;
a[3]=40;
a[4]=50;

//traversing array
for(int i=2;i<a.length;i++) //length is the property of array
System.out.println(a[i]);
}}