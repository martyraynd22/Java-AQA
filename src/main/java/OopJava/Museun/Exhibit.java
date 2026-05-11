package OopJava.Museun;

public abstract class Exhibit {
    private String name;

    public Exhibit (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void info();
    public abstract void preserve();
}
