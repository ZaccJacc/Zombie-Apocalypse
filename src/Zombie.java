import EVENT.InputHandler;
import Metric.Health;
import Metric.Hunger;
import Render.Renderloop;

import java.lang.*;

public class Zombie implements Health, Hunger {
    public int health;
    public int strength; //metric from 1-5? Metric.Health can be calculated based off this and the attack severity based off that?
    public int hunger;

    public Zombie(int strength){
        this.strength = strength;
        this.health = strength*10;

        /*
        *   TODO: Metric.Health metric ##
        *       Attack Value Metric ## Needs extension, premise is there.
        *       A method for registering hits, and their relative damage. Could be done through an attack class
        *           -> Maybe apply in health? Or maybe have health as an attribute of a wider conflict file
        */
    }

    @Override
    public int getMetric(int metric){
        switch (metric) {
            case 1:
                return this.health;
            case 2:
                return this.strength;
            case 3:
                return this.hunger;
            default:
                return 0;
        }
    }

    @Override
    public void setMetric(int metric, int value){
        switch(metric){
            case 1:
                this.health = value;
            case 2:
                this.strength = value;
            case 3:
                this.hunger = value;
        }
    }





    public static void main(String[] args){

        new Renderloop();
        Zombie zombie = new Zombie(1); //Solely for testing, this will form the basis of the opponent zombie object
    }
}
