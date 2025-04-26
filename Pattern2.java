import java.util.Scanner;
public class Pattern2
{
public static void main(String[] args)
{
int count=1;
Scanner input =new Scanner(System.in);
System.out.println("Enter the number of row to print the pattern");
int rows=input.nextInt();
System.out.println("**Printing the pattern**" );
for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(count);
	  count++;
    }
    System.out.println();

}
}
}
