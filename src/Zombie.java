import EVENT.InputHandler;
import Metric.Health;
import Metric.Hunger;
import Render.Renderloop;

import java.lang.*;

public class Zombie implements Health, Hunger {
    public int health;
    public int strength; //metric from 1-5? Metric. Health can be calculated based off this and the attack severity based off that?
    public int hunger = 100; //decided to make this a percentage based thing.

    public Zombie(int strength){
        this.strength = strength;
        this.health = strength*10;
    }


    /**
     * Returns the target metric for each category applicable to this entity.
     * @param metric An integer to reference which of the object's metrics should be edited. Constants are implemented
     *               through the interface Health.
     * @return The current object's metric for the target passed as a parameter.
     * @see Health
     * @see #setMetric
     */
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

    /**
     * Sets the target metric for each category applicable to this entity.
     * @param metric An integer to reference which of the object's metrics should be edited. Constants are implemented
     *               through the interface Health.
     * @param value The value by which the metric should be updated.
     * @see Health
     * @see #getMetric
     */
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
