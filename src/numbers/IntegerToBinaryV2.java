package numbers;

import java.util.Scanner;

public class IntegerToBinaryV2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
        scanner.close();
    }
}
