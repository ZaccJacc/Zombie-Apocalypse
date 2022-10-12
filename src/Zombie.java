import Metric.Health;
import Metric.Hunger;
import Entity.Entity;
import Render.Renderloop;

import java.lang.*;

public class Zombie extends Entity {
    public int health;
    public int strength; //metric from 1-5? Metric. Health can be calculated based off this and the attack severity based off that?
    public int hunger; //decided to make this a percentage based thing.

    public Zombie(int health, int strength, int hunger){
        super(health, strength, hunger);
    }

    public Zombie(){ // Constructor solely for testing methods and creating blank objects.
        super();
    }


    public static void main(String[] args){

        new Renderloop();
        Zombie zombie = new Zombie(); //Solely for testing, this will form the basis of the opponent zombie object
    }
}
