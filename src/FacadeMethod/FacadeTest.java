package FacadeMethod;

/**
 * Created by Jeremy on 2017/7/20.
 */
public class FacadeTest {

    public static void main(String []args){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
