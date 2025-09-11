package LW_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Array to hold the 5 digits
        int[] digits = new int[5];

        // Extract digits and store in array
        for (int i = 4; i >= 0; i--) {
            digits[i] = number % 10; // Get last digit
            number /= 10;           // Remove last digit
        }

        // Sort digits in ascending order
        Arrays.sort(digits);

        // Print digits in descending order (reverse of sorted array)
        System.out.print("The digits in descending order are: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(digits[i] + " ");

        }
        System.out.println(" ");
        System.out.println("Second largest digit is: " + digits[3]);


        scanner.close();
    }
}
