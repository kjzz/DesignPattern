package VistorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class VistorTest {

    public static void main(String []args){
        Vistor visitor = new MyVistor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }

}
