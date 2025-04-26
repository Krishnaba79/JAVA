import java.util.Scanner;
public class Duplicate
{
	public static void main(String args[])
	{
		int i,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n=input.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the Array Elements:");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}		

		System.out.println("Given Array Elements is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("Duplicate Array Elements is:");
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}

		if(count>0)
		{
			System.out.println("Duplicate value Found"+count);
		}
		else
		{
			System.out.println("Duplicate value Not Found");
		}
	}
}