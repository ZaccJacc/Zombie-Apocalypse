public class Dave {
    int FirstName;
    int lastname;
    public Health health;
    public Hunger hunger;
    int strength;

    public Dave(int level){
        this.health = new Health(level);
    }
}
