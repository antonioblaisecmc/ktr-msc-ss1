package App;

import App.Movable;

public class Warrior extends Character{
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
}