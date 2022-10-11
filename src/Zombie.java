import EVENT.Keypress;

import java.util.*;
import java.lang.*;

public class Zombie extends Health{
   Keypress keypress;
    public Health health;
    public int strength; //metric from 1-5? Health can be calculated based off this and the attack severity based off that?
    public Zombie(int strength){
        super(strength);
        this.strength = strength;
        this.health = new Health(this.strength);

        /*TODO: Health metric
        *       Attack Value Metric
        *       A method for registering hits, and their relative damage. Could be done through an attack class
        *           Maybe apply in health? Or maybe have health as an attribute of a wider conflict file*/
    }





    public static void main(String[] args){
        Keypress press = new Keypress();
        Zombie zombie = new Zombie(1); //Solely for testing, this will form the basis of the opponent zombie object
        /*while (zombie.health.health > 0){
            if (zombie.health.logHit(zombie.strength)){
                System.out.println("dead get good lmfao");
            } else {
                System.out.println("didnt die");
            }
        }*/
        System.out.println(zombie.health.health);

    }
}
