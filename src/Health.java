public class Health {
    public double health;

    public Health(int strength){
        this.health = strength*10;//currently based the health off multiplying the level by 10, this is up for change
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
}
