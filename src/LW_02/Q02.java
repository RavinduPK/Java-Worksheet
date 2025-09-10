package LW_02;

import java.util.Scanner;

public class Q02 {


    public static int countDigits(int number) {

        number = Math.abs(number);


        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            int input = scanner.nextInt();


            if (input < 0) {
                System.out.println("Program ended.");
                break;
            }


            int digits = countDigits(input);
            System.out.println(input + " has " + digits + " digits.");
        }

        scanner.close();
    }
}
