public interface Health { //ok for very long reasons, i'm going to turn this into an interface because i can and it'll work better

    int getMetric(int metric);
    void setMetric(int metric, int value);

    int HEALTH = 1;
    int STRENGTH = 2;


    default boolean logHit(int severity){
        if (this.getMetric(HEALTH) <= severity*5){ //will it die
            return true;
        }
        else {
            this.setMetric(HEALTH, this.getMetric(HEALTH) - severity*5); //if it aint gonna die, knock the health off and return false
            return false;
        }

    }

    default void raiseHealth(int healthValue){ //can be used for both eating and healing packages.
        if ((this.getMetric(HEALTH) + healthValue*6)>this.getMetric(STRENGTH)*10){
            this.setMetric(HEALTH, this.getMetric(STRENGTH)*10);
        } else {
            this.setMetric(HEALTH, this.getMetric(HEALTH) + healthValue*6);
        }
    }
}

