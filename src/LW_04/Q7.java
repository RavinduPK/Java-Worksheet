package LW_04;

import java.util.Scanner;

public class Q7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the digit number: ");
            int number = scanner.nextInt();

            if(number < 0) {
                System.out.println("Exiting the program.");
                break;
            }

            int numberofdigits =  String.valueOf(number).length();
            System.out.println("The number of digits in " + number + " is: " + numberofdigits);
        }
    }
}
