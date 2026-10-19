package AndreiTask;

abstract class MilitaryEquipment {
    private String name;
    private int speed;

    public MilitaryEquipment(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed(){
        return speed;
    }

   public abstract void attack();
}
