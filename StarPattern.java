import java.util.Scanner;
public class StarPattern
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the No:");
		int n=input.nextInt();

		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.println(" ");
			}
			
			for(int j=i;j<=(i-1*1);j++)
			{
				System.out.println(" *");
			}
		}

		System.out.println();
	}
}