package EventMethod;

import java.util.EventObject;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class EventState extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventState(Object source,String state) {
        super(source);
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
