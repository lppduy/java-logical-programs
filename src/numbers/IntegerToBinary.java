package numbers;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] binary = new int[10];
        int i = 0;
        
        while (number > 0) {
            binary[i++] = number % 2;
            number = number / 2;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

        scanner.close();
    }
}
