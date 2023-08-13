import java.util.Scanner;

public class Algo9 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String inputText;
        boolean valid;

        do {
            valid = true;

            System.out.println();
            System.out.print("Enter a single word: ");
            inputText = scanner.nextLine().strip();

            // checking blank inputs
            if (inputText.isBlank()) {
                System.out.println("Input cannot be blank or only spaces");
                continue;
            }

            // checking single words
            if (inputText.contains(" ")) {
                System.out.println("Input only a single word");
                valid = false;
            }

        } while (inputText.isBlank() || !valid);

        char[] inputTextArray = inputText.toLowerCase().toCharArray();

        //Check palindrome
        int i;
        for (i = 0; i < inputTextArray.length/2; i++) {
            if (inputTextArray[i] != inputTextArray[inputTextArray.length-1-i]) {
                System.out.println("Not palindrome");
                break;
            }
        }
        if (i == inputTextArray.length/2) System.out.println("It's a palindrom");

    }
}
