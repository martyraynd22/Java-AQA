package OopJava.Farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Вы добавили животное на ферму с именем:" + farmAnimal.getName());
    }

    public void manageAnimal() {
        if(farmAnimal!=null) {
            farmAnimal.care();
            farmAnimal.makeproduct();
        }
        else {
            System.out.println("Добавь животное на ферму");
        }
    }
}
