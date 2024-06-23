package numbers;

import java.util.Scanner;

public class SpecialTwoDigitNumberChecker {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit1 = number / 10;
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        int product = digit1 * digit2;
        if (sum + product == number) {
            System.out.println(number + " is a special two-digit number.");
        } else {
            System.out.println(number + " is not a special two-digit number.");
        }
        scanner.close();
    }
}
