package OopJava.Garden;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Вы добавили в сад растение: " + plant.getName());
    }

    public void supportPlant(){
        if (plant!=null){
            plant.care();
        }
        else {
            System.out.println("Посади растение");
        }
    }
}
