package OopJava.Farm;

public class Cow extends  FarmAnimal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Уход: нуждается в выпасе");
    }

    @Override
    public void makeproduct() {
        System.out.println("Производит продукцию: молоко");
    }
}
