import java.util.Scanner;
class BreakContinueWhile
{
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("Input an Integer:");
			n=input.nextInt();
			
			if(n!=0)
			{		
				System.out.println("You Entered: "+ n);
				continue;
			}
			else
			{
				break;
			}
		}	
	}
}