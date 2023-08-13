import java.util.Scanner;

public class Algo10 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String inputText;
        boolean valid;

        do {
            valid = true;

            System.out.println();
            System.out.print("Enter a phone number from following fromat (+94 XX XXXXXXX or 0XX-XXXXXXX): ");
            inputText = scanner.nextLine().strip();

            //chacking blank inputs or just spaces
            if (inputText.isBlank()) {
                System.out.println("Telephone number can't be empty");
                continue;
            }

            // Splitting the numbers from spaces or dashes
            String[] numsArray;

            if (inputText.startsWith("+94 ")) numsArray = inputText.substring(4).split(" ");
            else if (inputText.startsWith("0")) numsArray = inputText.substring(1).split("-");

            else {
                System.out.println("Invalid number");
                valid = false;
                continue;
            }

            // Checking the splited string array length is 2
            if (numsArray.length != 2) {
                System.out.println("invalid number");
                valid = false;
                continue;
            }

            // Chacking all characters are digits
            int[] digits = {2,7};

            loop:
            for (int i = 0; i < numsArray.length; i++) {

                if (numsArray[i].length()==digits[i]){ //Checking the first string length is 2 and second string length is 7

                    char[] subArray = numsArray[i].toCharArray();

                    for (int j = 0; j < subArray.length; j++) {
                        if(!Character.isDigit(subArray[j])) {
                            System.out.println("Invalid number");
                            valid = false;
                            break loop;
                        }
                    }

                } else {
                    System.out.println("Invalid number");
                    valid = false;
                    break loop;
                }

            }

        } while (inputText.isBlank() || !valid);

        System.out.println("Number is validated");
    }
}
