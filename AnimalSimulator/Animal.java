package AnimalSimulator;

public abstract class Animal implements AnimalActions {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
