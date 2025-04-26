//java program to declare, instantiate, initialize
//and traverse the java arrey.

class Testarrey
{
public static void main(String [] args)
{
int a[]= new int[5]; //decleration and instantiation
a[0]=10; // iniiallization
a[1]=20;
a[2]=70;
a[3]=40;
a[4]=50;
//traversing arrey
for(int i=0;i<a.length;i++)//length is the property of arrey
System.out.println(a[i]);
}
}