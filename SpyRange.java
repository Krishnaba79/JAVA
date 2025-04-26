package For_Loop;

import java.util.*;
public class SpyRange
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Start No:");
        int start_no=input.nextInt();
        System.out.println("Enter the End No:");
        int end_no=input.nextInt();
        
        int j,ans,k,i,sum,mul,count=0;
        for(j=start_no;j<=end_no;j++)
        {
            ans=0;
            for(k=j;k>0;k=k/10)
            {
                ans++;
            }
            sum=0;
            mul=1;
            for(i=j;i>0;i=i/10)
            {
                int b=i%10;
                sum=sum+b;
                mul=mul*b;
            }
            if(sum==mul)
            {
                System.out.println("SPY no is: "+j);
                count++;
            }
        }
        System.out.println("Total SPY no is: "+count);
    }
}
