package FactoryMethod.StaticFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class TestMutilFactory {

    public static void main(String []args){
        Sender mailSender = SendFactory.produceMailSender();
        Sender smsSender = SendFactory.produceSmsSender();
        mailSender.send();
        smsSender.send();
    }
}
