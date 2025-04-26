import java.util.Scanner;
public class Exercies11
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        System.out.println("The first n natural numbers are :"+num);
        for(int i=0;i<=num;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("the sum of the number" + sum);
    }
}
