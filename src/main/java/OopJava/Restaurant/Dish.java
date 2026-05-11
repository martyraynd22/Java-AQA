package OopJava.Restaurant;

public abstract class Dish implements Statsable{
    private String name;

    public Dish (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
