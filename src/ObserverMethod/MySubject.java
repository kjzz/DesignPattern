package ObserverMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("Update self!");
        notifyObserver();
    }
}
