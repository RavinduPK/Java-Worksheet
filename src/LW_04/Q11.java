package LW_04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;

        while(guess != randomNumber){
            System.out.println("Enter the guess number :");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too low! Try again.");
            } else if(guess>randomNumber){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }

         scanner.close();
    }
}
