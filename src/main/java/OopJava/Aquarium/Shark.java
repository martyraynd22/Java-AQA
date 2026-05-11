package OopJava.Aquarium;

public class Shark extends SeaAnimal{

    public Shark (String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Плавает быстро и агрессивно");
    }
}
