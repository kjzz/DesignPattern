package EventMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class EventTest {
    public static void main(String []args){
        EventSource eventSource = new EventSource();
        eventSource.addListener(new Handler() {
            @Override
            public void doHandler(EventState eventState) {
                System. out.println( "handler1 执行了,现在状态是：" + eventState.getState());
            }
        });
        eventSource.triggerEvent();
    }
}
