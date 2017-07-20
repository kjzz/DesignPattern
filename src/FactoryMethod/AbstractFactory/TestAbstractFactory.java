package FactoryMethod.AbstractFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class TestAbstractFactory {

    public static void main(String []args){
        Provider pro = new SmsFactory();
        Sender sender = pro.produce();
        sender.send();
        pro = new MailFactory();
        Sender mailSender = pro.produce();
        mailSender.send();
    }

}
