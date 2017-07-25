package MediatorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public abstract class User {

    private Mediator mediator;

    protected User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
