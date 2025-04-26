import java.util.Scanner;
public class SumOfArray
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=input.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the Array Elements:");
	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
			sum=sum+a[i];
		}

		System.out.println("Sum of Array Value is:"+sum);
	}
}