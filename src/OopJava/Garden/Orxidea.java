package OopJava.Garden;

public class Orxidea extends Plant{

    public Orxidea(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Уход: высокая влажность и тень");
    }
}
