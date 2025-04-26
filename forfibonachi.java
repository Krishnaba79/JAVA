public class JavaExample{
public static void main(String[] args){

Int count =7,num1=0,num2=1;
System.out.print("FibonacciSeries of" + count +" numbers :");

for(int i = 1;i<=count ; ++i)
{
System.out.print(num1+"");

/* on each iteration, we are assigning second number
* to the first number and assigning the sum of last two 
* numbers to the second number
*/
Int sum = num1+ num2;
num1 = num2;
num2 = sum;
}
}
}