package App;

public class Mage extends Character implements Movable{
    private final static String RPGClassName = "Mage";
    
    public Mage(String name){
        super(name, RPGClassName);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(name +": May the gods be with me.");
    }

    public void attack(String weapon){
        super.attack(weapon);
        System.out.println(this.getName() +" Feel the power of my "+weapon+"!");
    }
}