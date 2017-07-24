package BridgeMethod;

/**
 * Created by Jeremy on 2017/7/20.
 */
public class BridgeTest {

    public static void main(String []args){
        MyBridge myBridge = new MyBridge();
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();
        myBridge.setSourceable(sourceable1);
        myBridge.method();
        myBridge.setSourceable(sourceable2);
        myBridge.method();
    }

}
