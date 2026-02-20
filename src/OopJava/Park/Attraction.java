package OopJava.Park;

public abstract class Attraction implements Infoable, Supportable{
    private String name;

    public Attraction (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
