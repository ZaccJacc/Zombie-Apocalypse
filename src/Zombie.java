

import Render.DisplayHandler;
import Render.Renderloop;

import java.lang.*;
import java.util.concurrent.TimeUnit;

public class Zombie extends Health{
    public Health health;
    public static Renderloop renderloop;
    public int strength; //metric from 1-5? Health can be calculated based off this and the attack severity based off that?
    public Zombie(int strength){
        super(strength);
        this.strength = strength;
        this.health = new Health(this.strength);

        /*
        *   TODO: Health metric ##
        *       Attack Value Metric ## Needs extension, premise is there.
        *       A method for registering hits, and their relative damage. Could be done through an attack class
        *           -> Maybe apply in health? Or maybe have health as an attribute of a wider conflict file
        */
    }





    public static void main(String[] args) throws InterruptedException {
        System.out.println("e");
        Renderloop.Renderloop();
        // wouldn't the event need to be a direct attribute associated with the object that will manage it? And, by extension, would it not function incorrectly if we try and force it into another object?
        // I say the above because I have no idea how that event actually works.
        Zombie zombie = new Zombie(1); //Solely for testing, this will form the basis of the opponent zombie object

        System.out.println(zombie.health.health);

    }
}
