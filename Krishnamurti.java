package For_Loop;

import java.util.*;
public class Krishnamurti
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the NO:");
        int no=input.nextInt();
        
        int sum=0;
        for(int i=no;i>0;i=i/10)
        {
            int b=i%10;
            int fact=1;
            for(int j=1;j<=b;j++)
            {
                fact=fact*j;
            }
            sum=sum+fact;
        }
        if(sum==no)
        {
            System.out.println("Given no is Krishnamurti");
        }
        else
        {
            System.out.println("Given no is Not Krishnamurti");
        }
    }
}
