package AnimalSimulator;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats a bone happily!");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping in its kennel.");
    }
}
