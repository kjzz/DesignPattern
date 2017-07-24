package ObserverMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
