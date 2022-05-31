package App;

public class Warrior extends Character implements Movable{
    private final static String RPGClassName = "Warrior";
    
    public Warrior(String name){
        super(name, RPGClassName);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(name +": My name will go down in history!");
    }

    public void attack(String weapon){
        super.attack(weapon);
        System.out.println(this.getName() +" I'll crush you with my "+weapon+"!");
    }
}