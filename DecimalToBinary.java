import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args)
	{
		int n,count=0,a;
		String x="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any Decimal Number:");
		n=s.nextInt();
		while(n>0)
		{
			a=n%2;

			if(a==1)
			{
				count++;
			}
			x=x+ "" +a;
			n=n/2;
		}
		System.out.println("Binary Number:"+x);
		System.out.println("No of 1s:" + count);
	}
}