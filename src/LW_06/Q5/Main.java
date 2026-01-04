package LW_06.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];   // array containing ONLY dogs

        int petCount = 0;
        int dogCount = 0;

        // Input pets
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
                cat.setCoatColor(input.nextLine());

                pets[petCount++] = cat;
            }
            else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                dog.setWeight(input.nextDouble());
                input.nextLine(); // consume newline

                pets[petCount++] = dog;
                dogs[dogCount++] = dog; // add dog reference to dog array
            }
        }

        // Calculate average, min, and max dog weight
        if (dogCount > 0) {
            double sum = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {
                double w = dogs[i].getWeight();
                sum += w;

                if (w < min) min = w;
                if (w > max) max = w;
            }

            double average = sum / dogCount;

            System.out.println("\nDog Weight Statistics:");
            System.out.println("Average weight: " + average);
            System.out.println("Minimum weight: " + min);
            System.out.println("Maximum weight: " + max);
        }
        else {
            System.out.println("\nNo dogs entered.");
        }

        input.close();
    }
}
