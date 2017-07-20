package ProxyMethod;


/**
 * Created by Jeremy on 2017/7/3.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is the original method!");
    }
}
