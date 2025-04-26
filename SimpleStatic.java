class SimpleStatic{
// this is a static method
static int myMethod()
{
System.out.println("myMethod");
return 10*10;
}
public static void main(String [] args){
int result;
result=myMethod();     //you  can see that we are calling this method without creating anyobject
System.out.println("Squared value of 10 is:"+ result);

}
}