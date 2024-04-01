package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCreator {

    private ArrayList<Talkable> zoo;
    private Scanner scanner;

    public AnimalCreator(ArrayList<Talkable> zoo) {
        this.zoo = zoo;
        this.scanner = new Scanner(System.in);
    }

    public void createAndAddAnimal() {
        System.out.println("What type of animal do you want to create? (Dog/Cat)");
        String animalType = scanner.nextLine().trim();

        if (animalType.equalsIgnoreCase("Dog")) {
            createDog();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            createCat();
        } else {
            System.out.println("Invalid animal type entered.");
        }
    }

    private void createDog() {
        System.out.println("Is the dog friendly? (true/false)");
        boolean friendly = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the dog's name:");
        String name = scanner.nextLine().trim();

        Dog dog = new Dog(friendly, name);
        zoo.add(dog);
    }

    private void createCat() {
        System.out.println("Enter the cat's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the cat's name:");
        String name = scanner.nextLine().trim();

        Cat cat = new Cat(age, name);
        zoo.add(cat);
    }
}
