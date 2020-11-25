import javax.security.auth.Destroyable;

public class WalkingZombie extends Zombie implements Destroyable{
    public WalkingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }

    public void heal(){
        switch (this.level) {
            case 1:
                this.health += (20/100*this.health);
                break;
            case 2:
                this.health += (30/100*this.health);
                break;
            case 3:
                this.health += (40/100*this.health);
                break;
        }
    }
    @Override
    public void destroyed(){
        this.health -= (20*this.health/100);
    }

    public String getZombieInfo(){
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n" + info;
    }
}
