package FactoryMethod.MutilFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class TestMutilFactory {

    public static void main(String []args){
        SendFactory sendFactory = new SendFactory();
        Sender mailSender = sendFactory.produceMailSender();
        Sender smsSender = sendFactory.produceSmsSender();
        mailSender.send();
        smsSender.send();
    }
}
