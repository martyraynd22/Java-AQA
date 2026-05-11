package OopJava.Zoo;

public class Elephant extends Animal{

    public Elephant (String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Передвижение животного : ходьба");
    }

    @Override
    public void makesound() {
        System.out.println("Издает звук : трубит");
    }
}
