package FactoryMethod.AbstractFactory;


/**
 * Created by Jeremy on 2017/6/30.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is a MailSender!");
    }
}
