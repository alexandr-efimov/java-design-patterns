package factorymethod.demo;

import factorymethod.AnimalBlacksmith;
import factorymethod.HumanBlacksmith;
import factorymethod.Weapon;
import lombok.extern.java.Log;

import java.util.List;

import static java.util.Arrays.asList;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        List<Weapon> weapons = asList(new AnimalBlacksmith().produceWeapon(), new HumanBlacksmith().produceWeapon());
        weapons.forEach(weapon -> log.info("Weapon: " + weapon));
    }
}
