package BridgeMethod;

/**
 * Created by Jeremy on 2017/7/20.
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSourceable().method();
    }
}
