
import java.util.Scanner;
class Addnumber{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an interger:");
		int numberA = input.nextInt();
		System.out.println("You entered"+numberA);

		System.out.print("Enter an integer:");
		int numberB = input.nextInt();
		System.out.println("You entered" + numberB);

		System.out.print("the addition is:" + (numberA+numberB));
	}
}
	 