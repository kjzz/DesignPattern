package CommandMethod;

/**
 * Created by Jeremy on 2017/7/24.
 */
public class CommandTest {

    public static void main(String []args){
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }

}
