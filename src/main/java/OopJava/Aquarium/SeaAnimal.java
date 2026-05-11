package OopJava.Aquarium;

public abstract class SeaAnimal {
    private String name;
    public SeaAnimal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
