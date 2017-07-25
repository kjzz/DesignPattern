package MediatorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class User1 extends User {

    protected User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User1 Worked!");
    }
}
