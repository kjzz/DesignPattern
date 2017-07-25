package MediatorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class User2 extends User {
    protected User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User2 Worked!");
    }
}
