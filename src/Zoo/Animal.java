package Zoo;

public abstract class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    abstract void move();
    abstract void izdaetzvuk();
}