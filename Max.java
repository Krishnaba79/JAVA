import java.util.Scanner;
public class Max
{
	public static void main(String args[])
	{
		int n,i,j,max=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=input.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the Array Element:");
		
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();			
		}

		max=a[0];

		for(i=0;i<n;i++)	
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}	

		System.out.println("Max no is: "+max);
	}
}