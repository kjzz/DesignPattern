package ProxyMethod;



/**
 * Created by Jeremy on 2017/7/3.
 */
public class Proxy implements Sourceable {

    private Sourceable sourceable;

    public Proxy(){
        super();
        this.sourceable = new Source();
    }

    @Override
    public void method() {
        before();
        sourceable.method();
        after();
    }


    private void before(){
        System.out.println("Before Proxy!");
    }

    private void after(){
        System.out.println("After Proxy!");
    }
}
