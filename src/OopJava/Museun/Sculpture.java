package OopJava.Museun;

public class Sculpture extends Exhibit{

    public Sculpture (String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Скульптура");
    }

    @Override
    public void preserve() {
        System.out.println("Условия хранения: нуждается в реставрации");
    }
}
