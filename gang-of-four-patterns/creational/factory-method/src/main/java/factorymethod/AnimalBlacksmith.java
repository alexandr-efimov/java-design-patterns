package factorymethod;

import lombok.extern.java.Log;

@Log
public class AnimalBlacksmith implements Blacksmith {
    @Override
    public Weapon produceWeapon() {
        return Weapon.ANIMAL;
    }
}
