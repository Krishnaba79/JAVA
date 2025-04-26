import java.util.Scanner;
public class AverageArray {
   public static void main(String args[]){

      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number of elements");
      int num = s.nextInt();

     
      int[] myArray = new int[num];

   
      System.out.println("Enter the numbers one by one : ");
      System.out.println("Press Enter button after each number : ");

      for(int i =0; i<num; i++){
         myArray[i] = s.nextInt();
      }

     
      double average = 0;
      for(int i =0; i<num; i++){
         average = average + myArray[i];
      }

      average = average/num;
      System.out.println("Average of given numbers :: "+average);
   }
}