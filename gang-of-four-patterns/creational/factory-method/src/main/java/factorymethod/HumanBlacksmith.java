package factorymethod;

import lombok.extern.java.Log;

@Log
public class HumanBlacksmith implements Blacksmith {
    @Override
    public Weapon produceWeapon() {
        return Weapon.HUMAN;
    }
}
