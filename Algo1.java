import java.util.Scanner;

public class Algo1 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        int maxNum;

        do {
            System.out.println();
            System.out.print("Enter a positive number: ");
            maxNum = scanner.nextInt();
            scanner.nextLine();

            if (maxNum <=0) System.out.println("Invalid. Enter only positive numbers");

        } while (maxNum <= 0);

        int num1 = 0;
        int num2 = 1;
        int tempNum;
        System.out.println();
        
        do {

            System.out.print(num1+", ");

            tempNum = num2;
            num2 += num1;
            num1 = tempNum;
            
        } while (num1 < maxNum);

        System.out.print("\b\b");
        System.out.println("  ");
        System.out.println();


    }

}