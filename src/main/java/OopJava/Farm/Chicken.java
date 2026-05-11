package OopJava.Farm;

public class Chicken extends FarmAnimal{

    public Chicken (String name) {
        super(name);
    }

    @Override
    public void makeproduct() {
        System.out.println("Произхводит продукцию: яйца");
    }

    @Override
    public void care() {
        System.out.println("Уход: требует зерно");
    }
}
