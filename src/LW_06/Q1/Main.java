package LW_06.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store pets (max 100 pets)
        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type (c for cat, d for dog): ");
            char type = input.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                pets[count] = new Cat();
            } else if (type == 'd') {
                pets[count] = new Dog();
            } else {
                System.out.println("Invalid pet type. Try again.");
                continue;
            }

            pets[count].setName(name);
            count++;
        }

        // Output results
        System.out.println("\nPet List:");
        for (int i = 0; i < count; i++) {
            String petType = (pets[i] instanceof Cat) ? "Cat" : "Dog";
            System.out.println("Name: " + pets[i].getName() + ", Type: " + petType);
        }

        input.close();
    }
}
