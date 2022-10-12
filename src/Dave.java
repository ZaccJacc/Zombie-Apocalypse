public class Dave implements Health {
    int FirstName;
    int lastname;
    public int health;
    public Hunger hunger;
    int strength;
    public int x;
    public int y;

    public Dave(int level) {

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


}
