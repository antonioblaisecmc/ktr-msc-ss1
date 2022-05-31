package App;

import App.exceptions.WeaponException;
import App.exceptions.Warrior;
import App.exceptions.Mage;
import App.exceptions.Character;

public class MainTest{
    public static void main(String[] args){
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");

        try {
            mage.attack("");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }

    }
}