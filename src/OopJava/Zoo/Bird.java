package OopJava.Zoo;

public class Bird extends Animal{
    public Bird (String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Передвижение животного : полёт");
    }

    @Override
    public void makesound() {
        System.out.println("Издает звук: чирик");
    }
}
