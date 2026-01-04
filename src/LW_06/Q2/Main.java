package LW_06.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];   // array of pets
        int count = 0;

        // Input loop
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
                System.out.println("Invalid type. Try again.");
                continue;
            }

            pets[count].setName(name);
            count++;
        }

        // Output cats first
        System.out.println("\nCats:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
            }
        }

        // Output dogs next
        System.out.println("\nDogs:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }

        input.close();
    }
}
