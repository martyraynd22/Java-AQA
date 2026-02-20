package OopJava.Garden;

public class Cactus extends Plant{

    public Cactus(String name){
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Уход: много света, редкий полив");
    }
}
