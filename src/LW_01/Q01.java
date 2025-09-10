package LW_01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();


        if (word.length() % 2 == 0) {
            System.out.println("Try again. Please enter odd-length word .");
        } else {

            int middleIndex = word.length() / 2;


            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);
        }

        scanner.close();
    }
}
