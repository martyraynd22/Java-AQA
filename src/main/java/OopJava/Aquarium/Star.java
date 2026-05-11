package OopJava.Aquarium;

public class Star extends SeaAnimal{

    public Star (String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Медленно ползает");
    }
}
