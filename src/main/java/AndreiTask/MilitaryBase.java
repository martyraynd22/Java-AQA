package AndreiTask;

import java.util.List;

public class MilitaryBase {
    private List<MilitaryEquipment> texnika;

    public static void attackAllEquipment(List<MilitaryEquipment> texnika){
        for (MilitaryEquipment militaryEquipment : texnika){
            militaryEquipment.attack();
        }
    }
}
