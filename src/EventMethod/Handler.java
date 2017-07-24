package EventMethod;

import java.util.EventListener;

/**
 * Created by Jeremy on 2017/7/24.
 */
public abstract class Handler implements EventListener {

    public Handler(){

    }

    public void doHandler(EventState eventState){
        System.out.println("handler 执行了。现在状态是:");
    }

}
