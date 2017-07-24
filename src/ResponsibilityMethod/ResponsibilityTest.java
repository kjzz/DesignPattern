package ResponsibilityMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class ResponsibilityTest {

    public static void main(String []args){
        MyHandler handler1 = new MyHandler("Handler1");
        MyHandler handler2 = new MyHandler("Handler2");
        MyHandler handler3 = new MyHandler("Handler3");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.operator();
    }

}
