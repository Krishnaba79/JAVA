package For_Loop;

import java.util.*;
public class PalindromeNo
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
            sum=sum*10+b;
        }
        if(no==sum)
        {
            System.out.println("Given no is Palindrome");
        }
        else
        {
            System.out.println("Given no is Not Palindrome");
        }
    }
}
