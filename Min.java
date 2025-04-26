import java.util.Scanner;
public class Min
{
	public static void main(String args[])
	{
		int n,i,j,min=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=input.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the Array Element:");
		
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();			
		}

		min=a[0];

		for(i=0;i<n;i++)	
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}	

		System.out.println("Min no is: "+min);
	}
}