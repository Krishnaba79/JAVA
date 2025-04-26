import java.util.Scanner;
class Pattern1 {

public static void main(String args[]) {
int count=1;
Scanner input=new Scanner(System.in);
System.out.println("enter a rows:");
int rows=input.nextInt();

   
  
    for (int i = 1; i <= rows; i++) {
     
      for (int j = 1; j <= i; j++) {
      
        System.out.print(count);
        count++;
      }
      System.out.println( );
    }
}
}