package AnimalSimulator;

public class Cow extends Animal {

    public Cow() {
        super("Cow");
    }

    @Override
    public void makeSound() {
        System.out.println("The Cat says: Moo!");
    }

    @Override
    public void eat() {
        System.out.println("The Cow drinks milk");
    }

    @Override
    public void sleep() {
        System.out.println("The cow is sleeping in the farm");
    }
}