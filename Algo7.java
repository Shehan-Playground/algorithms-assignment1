import java.util.Scanner;

public class Algo7 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String inputText;

        do {
            System.out.print("\nEnter a sentence: ");
            inputText = scanner.nextLine().strip();

            // Checking blank input
            if (inputText.isBlank()) System.out.println("Input cannot be blank or only spaces");

        } while (inputText.isBlank());

        // Splitting the sentence into words
        String[] wordsArray = inputText.split(" ");

        // Initializing smallest words and longest words identifiers and their length counter identifiers
        String smallWord = wordsArray[0];
        int smallWordCharacterCount = smallWord.length();

        String longWord = wordsArray[0];
        int longWordCharacterCount = longWord.length();

        // Searching smallest and longest words
        for (int i = 1; i < wordsArray.length; i++) {

            // checking duplicate words
            int j;
            for (j = 0; j < i; j++) {
                if (wordsArray[j] == wordsArray[i]) break;
            }

            if (j==i) {

                // Assigning smallest and longest words into respective identifiers
                if (wordsArray[i].length() < smallWordCharacterCount) {
                    
                    smallWord = wordsArray[i];
                    smallWordCharacterCount = smallWord.length();
                }
                else if (wordsArray[i].length() == smallWordCharacterCount) smallWord += (", "+wordsArray[i]);

                else if (wordsArray[i].length() > longWordCharacterCount) {
                    longWord = wordsArray[i];
                    longWordCharacterCount = longWord.length();
                }
                else if (wordsArray[i].length() == longWordCharacterCount) longWord += (", "+wordsArray[i]);
            }
        }

        // Displaying output
        System.out.print("\nSmallest words: "+smallWord);
        System.out.println("\nCharacter count: " + smallWordCharacterCount);

        System.out.print("\nLongest words: "+longWord);
        System.out.println("\nCharacter count: " + longWordCharacterCount);

        System.out.println();

    }
}
