package ResponsibilityMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public abstract class AbstractHandler implements Handler {

    private Handler handler;


    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
