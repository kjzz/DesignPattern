package MediatorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class MyMediator implements Mediator {

    private User user1;

    private User user2;

    @Override
    public Mediator createMediator() {

        user1 = new User1(this);
        user2 = new User2(this);

        return this;
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }
}
