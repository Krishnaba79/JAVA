import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add elements to the ArrayList
        System.out.println("Enter elements to add (enter 'done' to finish):");
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            list.add(input);
            input = scanner.nextLine();
        }

        // Display the ArrayList
        System.out.println("ArrayList: " + list);

        // Search for an element
        System.out.print("Enter an element to search: ");
        String searchElement = scanner.nextLine();
        boolean found = list.contains(searchElement);
        if (found) {
            System.out.println(searchElement + " is found in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }

        // Remove an element
        System.out.print("Enter an element to remove: ");
        String removeElement = scanner.nextLine();
        boolean removed = list.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " is removed from the ArrayList.");
        } else {
            System.out.println(removeElement + " is not found in the ArrayList.");
        }

        // Display the updated ArrayList
        System.out.println("Updated ArrayList: " + list);

        scanner.close();
    }
}