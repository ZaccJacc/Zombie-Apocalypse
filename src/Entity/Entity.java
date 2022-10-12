package Entity;

import Metric.Health;
import Metric.Hunger;

public class Entity implements Health, Hunger {
    protected int health;
    protected int strength;
    protected int hunger;

    public Entity(int health, int strength, int hunger) {
        this.health = health;
        this.strength = strength;
        this.hunger = hunger;
    }

    public Entity(){}

    @Override
    public int getMetric(int metric) {
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
    public void setMetric(int metric, int value) {
        switch(metric){
            case 1:
                this.health = value;
            case 2:
                this.strength = value;
            case 3:
                this.hunger = value;
        }
    }
}
