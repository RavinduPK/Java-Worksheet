package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to MyJava Lo-Fat Burgers!");
        System.out.println("---------------------------------\n");

        displayEntreeMenu();
        System.out.print("Enter your entree choice (1-4): ");
        int entreeChoice = scanner.nextInt();
        double entreePrice = getEntreePrice(entreeChoice);

        displaySideDishMenu();
        System.out.print("Enter your side dish choice (1-4): ");
        int sideChoice = scanner.nextInt();
        double sidePrice = getSideDishPrice(sideChoice);

        displayDrinkMenu();
        System.out.print("Enter your drink choice (1-4): ");
        int drinkChoice = scanner.nextInt();
        double drinkPrice = getDrinkPrice(drinkChoice);

        // Calculate total
        double total = entreePrice + sidePrice + drinkPrice;

        // Display total
        System.out.println("\nYour Order Summary:");
        System.out.println("-------------------");
        System.out.printf("Entree: $%.2f%n", entreePrice);
        System.out.printf("Side Dish: $%.2f%n", sidePrice);
        System.out.printf("Drink: $%.2f%n", drinkPrice);
        System.out.printf("Total Price: $%.2f%n", total);

        System.out.println("\nThank you for visiting MyJava Lo-Fat Burgers!");
        scanner.close();
    }

    // ---------- MENU DISPLAY METHODS ----------

    public static void displayEntreeMenu() {
        System.out.println("Entree Menu:");
        System.out.println("1. Tofu Burger     $3.49");
        System.out.println("2. Cajun Chicken   $4.59");
        System.out.println("3. Buffalo Wings   $3.99");
        System.out.println("4. Rainbow Fillet  $2.99\n");
    }

    public static void displaySideDishMenu() {
        System.out.println("Side Dish Menu:");
        System.out.println("1. Rice Cracker    $0.79");
        System.out.println("2. No-Salt Fries   $0.69");
        System.out.println("3. Zucchini        $1.09");
        System.out.println("4. Brown Rice      $0.59\n");
    }

    public static void displayDrinkMenu() {
        System.out.println("Drink Menu:");
        System.out.println("1. Cafe Mocha      $1.99");
        System.out.println("2. Cafe Latte      $1.90");
        System.out.println("3. Espresso        $2.49");
        System.out.println("4. Oolong Tea      $0.99\n");
    }

    // ---------- PRICE METHODS ----------

    public static double getEntreePrice(int choice) {
        if (choice == 1) return 3.49;
        else if (choice == 2) return 4.59;
        else if (choice == 3) return 3.99;
        else if (choice == 4) return 2.99;
        else {
            System.out.println("Invalid choice. Defaulting to $0.00");
            return 0.0;
        }
    }

    public static double getSideDishPrice(int choice) {
        if (choice == 1) return 0.79;
        else if (choice == 2) return 0.69;
        else if (choice == 3) return 1.09;
        else if (choice == 4) return 0.59;
        else {
            System.out.println("Invalid choice. Defaulting to $0.00");
            return 0.0;
        }
    }

    public static double getDrinkPrice(int choice) {
        if (choice == 1) return 1.99;
        else if (choice == 2) return 1.90;
        else if (choice == 3) return 2.49;
        else if (choice == 4) return 0.99;
        else {
            System.out.println("Invalid choice. Defaulting to $0.00");
            return 0.0;
        }
    }
}
