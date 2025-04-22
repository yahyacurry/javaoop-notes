package AnimalSimulator;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("The Cat says: Meow");
    }

    @Override
    public void eat() {
        System.out.println("The cat nibbles on fish");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping in its shelter.");
    }
}