package App;

public class MainTest{
    public static void main(String[] args){
        Character warrior = new Warrior("Jean-Luc"); 
        Character mage = new Mage("Robert");
        //warrior.attack("hammer");
        //mage.attack("magic");


        warrior.moveRight(); 
        warrior.moveLeft(); 
        warrior.moveBack(); 
        warrior.moveForward(); 
        mage.moveRight(); 
        mage.moveLeft(); 
        mage.moveBack(); 
        mage.moveForward();
    }
}