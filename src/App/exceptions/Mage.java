package App.exceptions;

public class Mage extends Character {
    private final static String RPGClassName = "Mage";
    private final static String WEAPON = "magic";

    public Mage(String name){
        super(name, RPGClassName);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(name +": May the gods be with me.");
    }

    public void attack(String weapon) throws WeaponException{
        if(weapon.equals("")){
            throw new WeaponException(this.getName() +": I refuse to fight with my bare hands.");
        }
        if(!WEAPON.equals(weapon)){
            throw new WeaponException(this.getName() +": A "+weapon+"?? What should I do with this?!");
        }
        super.attack(weapon);
        System.out.println(this.getName() +" I'll crush you with my "+weapon+"!");
    }

    @Override
    public void tryToAttack(String weapon) {

    }

    public void moveRight(){
        System.out.println(this.getName() +": moves right furtively.");
    }
    public void moveLeft(){
        System.out.println(this.getName() +": moves left furtively.");
    }
    public void moveForward(){
        System.out.println(this.getName() +": moves forward furtively.");
    }
    public void moveBack(){
        System.out.println(this.getName() +": moves back furtively.");
    }
    
}