package LW_01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();


        String[] parts = fullName.split(" ");


        if (parts.length != 3) {
            System.out.println("Error: Please enter your name in the format: first middle last");
        } else {
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];


            char middleInitial = middle.charAt(0);


            String formattedName = last + ", " + first + " " + middleInitial + ".";
            System.out.println("Formatted name: " + formattedName);
        }

        scanner.close();
    }
}

