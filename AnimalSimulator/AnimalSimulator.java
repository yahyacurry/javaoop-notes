package AnimalSimulator;

import java.util.Scanner;



public class AnimalSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalActions animal;

        while (true) {
            System.out.println("\n=== Animal Sound Simulator ===");
            System.out.println("Choose an animal:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Cow");
            System.out.println("4. Exit");
            System.out.print("> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> animal = new Dog();
                case 2 -> animal = new Cat();
                case 3 -> animal = new Cow();
                case 4 -> {
                    System.out.println("Thanks for playing!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            String animalName = ((Animal) animal).getName();

            while (true) {
                System.out.println("\nWhat would you like the " + animalName.toLowerCase() + " to do?");
                System.out.println("1. Make Sound");
                System.out.println("2. Eat");
                System.out.println("3. Sleep");
                System.out.println("4. Back to Animal Selection");
                System.out.print("> ");
                int action = scanner.nextInt();

                switch (action) {
                    case 1 -> animal.makeSound();
                    case 2 -> animal.eat();
                    case 3 -> animal.sleep();
                    case 4 -> {
                        System.out.println("Going back...");
                        break;
                    }
                    default -> System.out.println("Invalid action.");
                }

                if (action == 4) break;
            }
        }
    }
}

