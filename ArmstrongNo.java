package For_Loop;

import java.util.*;
public class ArmstrongNo
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the NO:");
        int no=input.nextInt();
        
        int sum=0,i,count=0;
        for(i=no;i>0;i=i/10)
        {
            count++;
        }
        for(i=no;i>0;i=i/10)
        {
            int b=i%10;
            sum=sum+(int)Math.pow(b, count);
        }
        if(sum==no)
        {
            System.out.println("Given no is Armstrong");
        }
        else 
        {
            System.out.println("Given no is Not Armstrong");
        }
    }
}
