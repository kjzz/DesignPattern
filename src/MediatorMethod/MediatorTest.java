package MediatorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class MediatorTest {

    public static void main(String []args){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }

}
