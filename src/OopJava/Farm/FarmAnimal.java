package OopJava.Farm;

public abstract  class FarmAnimal {
    private String name;

    public FarmAnimal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void care();
    public abstract void makeproduct();

}
