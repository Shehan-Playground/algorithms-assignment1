import java.util.Scanner;

public class Algo5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        char[] ascii = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
                        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
                        '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', 
                        ':', ';', '<', '=', '>', '?', 
                        '@', '[', '\\', ']', '^', '_', '`', 
                        '{', '|', '}', '~', ' '
                        };

        
        String inputText;
        char[] text;
        boolean valid = true;

        do {
            System.out.println();
            System.out.print("Enter a text: ");
            inputText = scanner.nextLine().strip();

            text = inputText.toCharArray();

            if (inputText.isBlank()) {
                System.out.println("Input cannot be blank or only spaces");
                continue;
            }

            for (int i = 0; i < text.length; i++) {
                int j = 0;
                for (j = 0; j < ascii.length; j++) {
                    if (text[i] == ascii[j]) break;
                }
                if (j == ascii.length) {
                    valid = false;
                    System.out.println("Use only ASCII characters");
                    break;
                }
            }

        } while (inputText.isBlank() || !valid);

        System.out.println();
        for (int i = text.length-1; i >= 0; i--) {
            System.out.print(text[i]);
        }

        System.out.println();
        System.out.println();

    }
}
