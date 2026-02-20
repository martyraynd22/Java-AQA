package OopJava.Park;

public class Park {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Вы добавили аттракцион " + attraction.getName());
    }

    public void opperateAttraction() {
        if (attraction!= null) {
            attraction.info();
            attraction.support();
        }
        else {
            System.out.println("Добавьте аттракцион в парк чтобы работать с ним");
        }
    }
}
