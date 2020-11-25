import javax.security.auth.Destroyable;

public class Plant {
    public void doDestroy(Destroyable d){
        d.isDestroyed();
    }
}
