package CommandMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();

    }

}
