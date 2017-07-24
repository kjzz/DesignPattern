package EventMethod;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class EventSource {

    private Set<Handler> eventListeners;

    public EventSource(){
        this.eventListeners = new LinkedHashSet<Handler>();
    }

    public void addListener(Handler handler){
        eventListeners.add(handler);
    }

    public void remove(Handler handler){
        eventListeners.remove(handler);
    }

    public void triggerEvent(){
        if(eventListeners == null){
            return;
        }
        EventState eventState = new EventState(this,"Trigger!!!!");
        notifies(eventState);

    }

    public void notifies(EventState eventState){
        if(eventListeners.size()>0){
            for (Handler handler:eventListeners){
                handler.doHandler(eventState);
            }
        }
    }


    public Set<Handler> getEventListeners() {
        return eventListeners;
    }

    public void setEventListeners(Set<Handler> eventListeners) {
        this.eventListeners = eventListeners;
    }
}
