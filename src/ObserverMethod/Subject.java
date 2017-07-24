package ObserverMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();

    public void operation();

}
