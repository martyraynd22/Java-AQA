package AndreiTask;

public class RocketLauncher extends MilitaryEquipment{
    public RocketLauncher(String name, int speed) {
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
