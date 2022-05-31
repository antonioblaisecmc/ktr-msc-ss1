package App.exceptions;

import App.Movable;

public abstract class Character implements Movable {
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    public Character(String name){
        this.name = name;
        this.RPGClass  = "Character";
    }

    public Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public String getName(){
        return this.name;
    }

    public String getRPGClass(){
        return this.RPGClass;
    }

    public int getLife(){
        return this.life;
    }

    public int getAgility(){
        return this.agility;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getWit(){
        return this.wit;
    }

    public void attack(String s) throws WeaponException{
        System.out.println(this.name +": Rrrrrrrrr....");
    }

    public void unsheathe(){
        System.out.println(this.getName() +": unsheathes his weapon.");
    }

    public abstract void tryToAttack(String weapon);
}