package PlayerClient;

import Entity.Entity;
import Metric.Health;


public class Dave extends Entity {
    int FirstName;
    int lastname;
    public int x;
    public int y;

    public Dave(int health, int strength, int hunger){
        super(health, strength, hunger);
    }

    public Dave(){
        super();
    }

    public boolean canattack(){


        return false;
    }


    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
}
