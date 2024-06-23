package numbers;

import java.util.Scanner;

public class NivenNumberChecker {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % sum(number) == 0) {
            System.out.println(number + " is a Niven number.");
        } else {
            System.out.println(number + " is not a Niven number.");
        }
        scanner.close();
    }

    private static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
