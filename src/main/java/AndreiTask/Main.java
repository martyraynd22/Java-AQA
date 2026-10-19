package AndreiTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tank ussr = new Tank("T-34",1050);
        RocketLauncher usa = new RocketLauncher("РСЗО HIMARS",950);
        Helicopter germany = new Helicopter("NH90 ",880);

        List<MilitaryEquipment> texnika = new ArrayList<>();
        texnika.add(new Tank("T-34",1050));
        texnika.add(new RocketLauncher("РСЗО HIMARS",950));
        texnika.add(new Helicopter("NH90 ",880));

        MilitaryBase.attackAllEquipment(texnika);
    }
}
