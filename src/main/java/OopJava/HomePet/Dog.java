package OopJava.HomePet;

public class Dog extends HomePet{

    public Dog (String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Питание: ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("С ним нужно гулять");
    }
}
