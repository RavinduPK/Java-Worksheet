package LW_06.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];
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
                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter coat color: ");
                String color = input.nextLine();
                cat.setCoatColor(color);

                pets[count] = cat;
            }
            else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                double weight = input.nextDouble();
                input.nextLine(); // consume newline
                dog.setWeight(weight);

                pets[count] = dog;
            }
            else {
                System.out.println("Invalid type. Try again.");
                continue;
            }

            count++;
        }

        // Output cats first
        System.out.println("\nCats:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                Cat cat = (Cat) pets[i];
                System.out.println("Name: " + cat.getName() +
                        ", Type: Cat" +
                        ", Coat Color: " + cat.getCoatColor());
            }
        }

        // Output dogs next
        System.out.println("\nDogs:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];
                System.out.println("Name: " + dog.getName() +
                        ", Type: Dog" +
                        ", Weight: " + dog.getWeight());
            }
        }

        input.close();
    }
}
