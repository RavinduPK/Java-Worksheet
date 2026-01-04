package LW_06.Q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];
        Cat[] cats = new Cat[100];

        int petCount = 0;
        int dogCount = 0;
        int catCount = 0;

        // Initial input routine
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
                cats[catCount++] = cat;
            }
            else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                dog.setWeight(input.nextDouble());
                input.nextLine();

                pets[petCount++] = dog;
                dogs[dogCount++] = dog;
            }
        }

        int choice;

        // Menu loop
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: // Add Cat
                    Cat newCat = new Cat();
                    System.out.print("Enter cat name: ");
                    newCat.setName(input.nextLine());
                    System.out.print("Enter coat color: ");
                    newCat.setCoatColor(input.nextLine());

                    pets[petCount++] = newCat;
                    cats[catCount++] = newCat;
                    break;

                case 2: // Add Dog
                    Dog newDog = new Dog();
                    System.out.print("Enter dog name: ");
                    newDog.setName(input.nextLine());
                    System.out.print("Enter weight: ");
                    newDog.setWeight(input.nextDouble());
                    input.nextLine();

                    pets[petCount++] = newDog;
                    dogs[dogCount++] = newDog;
                    break;

                case 3: // Remove Cat
                    System.out.print("Enter cat name to remove: ");
                    String catName = input.nextLine();

                    catCount = removeCat(cats, catCount, catName);
                    petCount = removePet(pets, petCount, catName);
                    break;

                case 4: // Remove Dog
                    System.out.print("Enter dog name to remove: ");
                    String dogName = input.nextLine();

                    dogCount = removeDog(dogs, dogCount, dogName);
                    petCount = removePet(pets, petCount, dogName);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }

    // Remove pet from Pet array
    public static int removePet(Pet[] pets, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (pets[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                return count - 1;
            }
        }
        return count;
    }

    // Remove cat
    public static int removeCat(Cat[] cats, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (cats[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    cats[j] = cats[j + 1];
                }
                return count - 1;
            }
        }
        return count;
    }

    // Remove dog
    public static int removeDog(Dog[] dogs, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    dogs[j] = dogs[j + 1];
                }
                return count - 1;
            }
        }
        return count;
    }
}
