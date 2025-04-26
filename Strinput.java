import java.util.Scanner;
class Strinput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name:");
		String str = input.nextLine();
		System.out.println("Your name is"+str);
	}
}