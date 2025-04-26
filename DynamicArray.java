import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        // Create an ArrayList object to store strings
        ArrayList<String> dynamicArray = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Orange");
        dynamicArray.add("Mango");

        // Print the contents of the dynamic array
        System.out.println("Contents of the dynamic array:");

        for (String element : dynamicArray) {
            System.out.println(element);
        }
    }
}
