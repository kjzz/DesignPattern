package ObserverMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class ObserverTest {

    public static void main(String []args){
        Subject mySubject = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        mySubject.add(observer1);
        mySubject.add(observer2);
        mySubject.operation();
        mySubject.remove(observer1);
        mySubject.operation();
    }

}
