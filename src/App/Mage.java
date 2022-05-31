package App;

import App.Movable;

public class Mage extends Character{
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