public class Health { //ok for very long reasons, i'm going to turn this into an interface because i can and it'll work better
    public double health;
    private final int strength;

    public Health(int strength){
        this.health = strength*10;//currently based the health off multiplying the level by 10, this is up for change
        this.strength = strength;
    }

    public boolean logHit(int severity){
        if (this.health <= severity*5){ //will it die
            return true;
        }
        else {
            this.health = this.health - severity*5; //if it aint gonna die, knock the health off and return false
            return false;
        }

    }

    public void raiseHealth(int healthValue){ //can be used for both eating and healing packages.
        if ((this.health + healthValue*6)>this.strength*10){
            this.health = this.strength*10;
        } else {
            this.health += healthValue*6;
        }
    }
}

