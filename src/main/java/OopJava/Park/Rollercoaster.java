package OopJava.Park;

public class Rollercoaster extends Attraction{

    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public void support() {
        System.out.println("Ощущения: Экстримальные");
    }

    @Override
    public void info() {
        System.out.println("Требует: проверка безопасности");
    }
}
