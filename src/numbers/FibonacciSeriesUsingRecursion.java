package numbers;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
