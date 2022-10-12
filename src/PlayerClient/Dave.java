package PlayerClient;

import Metric.Health;

public class Dave implements Health {
    int FirstName;
    int lastname;
    public int health = 100;
    public int hunger = 100;
    int strength;
    public int x;
    public int y;

    public void Dave() {

    }
    public boolean canattack(){


        return canattack();
    }
    @Override
    public int getMetric(int metric) {
        switch (metric) {
            case 1:
                return this.health;
            case 2:
                return this.strength;
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
        }
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
}
