import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your text:");
        String text = scanner.nextLine();
        
        int charCount = text.length();
        int lineCount = text.split("\n").length;
        int wordCount = text.split("\\s+").length;
        
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}