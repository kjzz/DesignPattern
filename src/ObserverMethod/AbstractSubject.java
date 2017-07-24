package ObserverMethod;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Jeremy on 2017/7/24.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        Enumeration<Observer> enuo = observers.elements();

        while (enuo.hasMoreElements()){
            enuo.nextElement().update();
        }

    }

    public Vector<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Vector<Observer> observers) {
        this.observers = observers;
    }
}
