import java.util.Scanner;
public class Pattern1
{
public static void main(String[] args)
{
Scanner input =new Scanner(System.in);
System.out.println("Enter the number of row to print the pattern");
int rows=input.nextInt();
System.out.println("**Printing the pattern**" );
for(int i=rows+1;i>=1;i--)
{
    for(int j=i;j<rows+1;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=(i-1*1);j++)
    {
        System.out.print(" *");
    }

    System.out.println();

}
}
}
