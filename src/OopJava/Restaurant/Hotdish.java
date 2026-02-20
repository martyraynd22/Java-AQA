package OopJava.Restaurant;

public class Hotdish extends Dish{


    public Hotdish (String name) {
        super(name);
    }


    @Override
    public void stats() {
        System.out.println("Температура блюда");
    }

}
