package AndreiTask;

public class Helicopter extends MilitaryEquipment {
    public Helicopter(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void attack() {
        System.out.println(getName() + " стреляет снарядом" + " со скоростью "+ getSpeed() + " м/с.");
    }
}
