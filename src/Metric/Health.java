package Metric;

/**
 * Interface used to register and govern the default metric for keeping the entity alive. Extended by hunger,
 * implemented by all entities and resources that can manipulate health.
 * @see Hunger
 * @see Zombie
 */
public interface Health {

    int getMetric(int metric);
    void setMetric(int metric, int value);

    int HEALTH = 1;
    int STRENGTH = 2;


    /**
     * The default method for logging a hit on the entity. This can also be done by using raiseHealth with a negative
     * healthValue, but that does not account for the impacts of the attacking entities' strength.
     * @param severity The severity of the hit - based on the strength of the entity attacking.
     * @return A boolean value indicating whether the entity being attacked will die or not.
     * @see #raiseHealth
     */
    default boolean logHit(int severity){
        if (this.getMetric(HEALTH) <= severity*5){ //will it die
            return true;
        }
        else {
            this.setMetric(HEALTH, this.getMetric(HEALTH) - severity*5); //if it aint gonna die, knock the health off and return false
            return false;
        }

    }

    /**
     * The default method of manipulating the entity's health metric. Can be used as an alternative to logHit.
     * @param healthValue A factor representing the healing value of the resource being processed.
     * @see #logHit
     */
    default void raiseHealth(int healthValue){ //can be used for both eating and healing packages.
        if ((this.getMetric(HEALTH) + healthValue*6)>this.getMetric(STRENGTH)*10){
            this.setMetric(HEALTH, this.getMetric(STRENGTH)*10);
        } else {
            this.setMetric(HEALTH, this.getMetric(HEALTH) + healthValue*6);
        }
    }
}

