package OopJava.HomePet;

public class PetManager {
    private HomePet homepet;

    public void addHomePet(HomePet homepet) {
        this.homepet = homepet;
        System.out.println("Вы завели домашнее животное и назвали его " + homepet.getName());
    }

    public void care(){
        if(homepet!=null){
            homepet.feed();
            homepet.interact();
        }
        else {
            System.out.println("Сначала заведи домашнее животное");
        }
    }
}
