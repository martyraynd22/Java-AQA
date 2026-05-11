package OopJava.Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Вы добавили животное c именем" + animal.getName() );
    }

    public void showanimalbehavior(){
        if(animal != null) {
            animal.move();
            animal.makesound();
        }
        else{
            System.out.println("Добавь животное");
        }
    }
}
