package ObserverMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received!");
    }
}
