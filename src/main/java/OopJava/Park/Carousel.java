package OopJava.Park;

public class Carousel extends  Attraction{

    public Carousel (String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Ощущения: Спокойный аттракцион");
    }

    @Override
    public void support() {
        System.out.println("Требует: техническое обслуживание");
    }
}
