import javax.security.auth.Destroyable;

public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int strength){
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public void destroy(){
        strength -= (0.1 * strength);
    }

    public String getBarrierInfo(){
        return "Barrier Strength = " + strength;
    }
    
}
