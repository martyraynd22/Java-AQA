package OopJava.Restaurant;

public class Drink extends Dish{


    public Drink (String name) {
        super(name);
    }

    @Override
    public void stats() {
        System.out.println("Обьем напитка");
    }
}
