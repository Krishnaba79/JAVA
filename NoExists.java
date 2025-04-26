import java.util.Scanner;
public class NoExists
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

		System.out.println("Enter the No:");
		int no=input.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]==no)
			{
				count++;
			}
		}

		if(count>0)	
		{
			System.out.println("No is Exists: "+count);
		}
		else
		{
			System.out.println("No is Not Exists");
		}
	}
}