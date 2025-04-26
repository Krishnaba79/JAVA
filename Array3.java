//to illustrate the use of declaration, instantiation
//intilization of array in a single line

class Array3{
public static void main(String [] args)
{
int a[]={33,3,4,5};//declaration,instantiation,intilization

//printing array
for(int i=0;i<a.length;i++)//length is property of array
System.out.println(a[i]);

String [] cars={"volvo","bmw","ford","mazda"};
cars[0]="opel";
System.out.println(cars[0]); 

System.out.println(cars.length);
for(String i:cars)
{
System.out.println(i);
}


}}
