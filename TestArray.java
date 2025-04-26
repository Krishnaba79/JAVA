public class TestArray
{
public static void main(String[] args)
{
double[] myList={1.9,2.9,3.4,3.5};

//print all the array elements
for(int i =0;i<myList.length;i++)
{
System.out.println(myList[i]+" ");
}

//summing all elements
double total=0;

for(int i=0;i<myList.length;i++)
{
total+=myList[i];
}
System.out.println("Total is "+ total);

//finding the largest element
double max = myList[0];
for(int i =1;i<myList.length;i++)
{
if(myList[i]>max) max = myList[i];
}
System.out.println("Max is " +max);


//declaration and instantion
int a[]=new int[5];
a[0]=10;//initilization
a[1]=20;
a[2]=70;
a[3]=40;
a[4]=50;
//traversing array
for(int i=2; i<a.length;i++)//length is the property of array
System.out.println(a[i]);
}
}