package FactoryMethod.MutilFactory;


/**
 * Created by Jeremy on 2017/6/30.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender!");
    }
}
