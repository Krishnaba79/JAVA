import java.util.Scanner;
public class Pattern{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("enter a rows:");
int rows=input.nextInt();

 for(int i = rows+1; i >= 1; i--)
    {
         
        
        for(int j = i; j < rows+1; j++)
        {
            System.out.print(" ");
        }
         
      
        for(int j = 1; j <= (i-1*1); j++)
        {
            System.out.print(" *");
        }
         
      
        System.out.println("");
    }
}
}