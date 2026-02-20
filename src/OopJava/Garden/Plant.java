package OopJava.Garden;

public abstract class Plant {
    private String name;

    public Plant (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void  care();
}
