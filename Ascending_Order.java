import java.util.Scanner;
public class Ascending_Order
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner  input=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=input.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the array elements:");

		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}

		for(int i=0;i<n;i++)
		{	
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("Ascending Order is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		//System.out.println(a[n-1]);

		for(int i=0;i<n;i++)
		{	
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("Decending Order is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}