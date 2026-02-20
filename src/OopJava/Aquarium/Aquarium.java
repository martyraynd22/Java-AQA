package OopJava.Aquarium;

import OopJava.Zoo.Animal;

public class Aquarium {
    private SeaAnimal seaAnimal;

    public void addSeaAnimal(SeaAnimal seaAnimal) {
        this.seaAnimal = seaAnimal;
        System.out.println("Вы добавили морское животное " + seaAnimal.getName());
    }

    public void showAction(){
        if (seaAnimal != null){
            seaAnimal.move();
        }
        else {
            System.out.println("Добавь морское животное");
        }
    }
}
