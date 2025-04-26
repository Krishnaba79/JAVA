import java.util.Scanner;
class Result
{
	public static void main(String[] args)
	{
		int total;
		float avg;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the marks of Sub1:");
		int sub1=input.nextInt();

		System.out.println("Enter the marks of Sub2:");
		int sub2=input.nextInt();

		System.out.println("Enter the marks of Sub3:");
		int sub3=input.nextInt();

		total=sub1+sub2+sub3;
		avg=total/3;
		
		if(avg>70)
		{
			System.out.println("Grade A");
		}
		
		else if(avg>60)
		{
			System.out.println("Grade B");
		}
		
		else if(avg>50)
		{
			System.out.println("Grade C");
		}
	
		else if(avg>40)
		{
			System.out.println("Grade D");
		}

		else
		{
			System.out.println("Fail");
		}	
	}
}