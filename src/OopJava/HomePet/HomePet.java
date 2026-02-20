package OopJava.HomePet;

public abstract class HomePet implements feedable,interactable{
    private String name;

    public HomePet (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
