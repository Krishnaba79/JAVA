import java.util.Scanner;
class Input{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an interger:");
		int number1 = input.nextInt();
		System.out.println("You entered"+number1);

		System.out.print("Enter an integer:");
		int number2 = input.nextInt();
		System.out.println("You entered" + number2);

		System.out.print("the addition is:" + (number1+number2));
	}
}
	 