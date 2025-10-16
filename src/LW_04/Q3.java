package LW_04;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the power of 10 :");
        int selection = scanner.nextInt();

        if (selection == 6) {
            System.out.println("You selected Million");
        } else if (selection == 9) {
            System.out.println("You selected Billion");
        } else if (selection == 12) {
            System.out.println("You selected Trillion");
        } else if (selection == 15) {
            System.out.println("You selected Quadrillion");
        } else if (selection == 18) {
            System.out.println("You selected Quintillion");
        } else if (selection == 21) {
            System.out.println("You selected Sextillion");
        } else if (selection == 30) {
            System.out.println("You selected Nonillion");
        } else if (selection == 100) {
            System.out.println("You selected Googol");
        } else {
            System.out.println("Invalid selection");


        }
    }
}
