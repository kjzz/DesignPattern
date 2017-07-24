package BridgeMethod;

/**
 * Created by Jeremy on 2017/7/20.
 */
public abstract class Bridge {

    private Sourceable sourceable;



    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
