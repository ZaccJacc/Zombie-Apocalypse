public interface Hunger extends Health {
    /* ok please don't kill me but because the hunger value directly requires to use
    * the health manipulation on a higher level, ive extended it*/

    int HUNGER = 3;

    default void logBite(int munchvalue){
        this.setMetric(HUNGER, this.getMetric(HUNGER)+munchvalue*3);
        this.raiseHealth(munchvalue);
    }

}
