package OopJava.Museun;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Вы добавили экспонат " + exhibit.getName());
    }

    public void showExibit() {
        if (exhibit!= null) {
            exhibit.info();
            exhibit.preserve();
        }
        else {
            System.out.println("Добавьте экспонат в музей");
        }
    }
}
