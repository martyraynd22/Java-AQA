package OopJava.Museun;

public class Manuscript extends Exhibit{

    public Manuscript (String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Древнейший текст");
    }

    @Override
    public void preserve() {
        System.out.println("Условия храненения: требует контролируемой влажности");
    }
}
