package App.exceptions;

public class Warrior extends Character {
    private final static String RPGClassName = "Warrior";
    public final static String WEAPON = "hammer";

    public Warrior(String name){
        super(name, RPGClassName);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(name +": My name will go down in history!");
    }

    public void attack(String weapon) throws WeaponException{
        if(weapon.equals("")){
            throw new WeaponException(this.getName() +": I refuse to fight with my bare hands.");
        }
        if(!WEAPON.equals(weapon)){
            throw new WeaponException(this.getName() +": A I don't need this stupid "+weapon+"! Don't misjudge my powers!");
        }
        super.attack(weapon);
        System.out.println(this.getName() +" I'll crush you with my "+weapon+"!");
    }

    public void moveRight(){
        System.out.println(this.getName() +": moves right like a bad boy.");
    }
    public void moveLeft(){
        System.out.println(this.getName() +": moves left like a bad boy.");
    }
    public void moveForward(){
        System.out.println(this.getName() +": moves forward like a bad boy.");
    }
    public void moveBack(){
        System.out.println(this.getName() +": moves back like a bad boy.");
    }

    @Override
    public void tryToAttack(String weapon) {
        try{
            this.attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
}