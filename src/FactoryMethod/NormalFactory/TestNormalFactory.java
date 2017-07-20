package FactoryMethod.NormalFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class TestNormalFactory {

    public static void main(String []args){
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms1");
        if (sender==null){
            return;
        }
        sender.send();
    }
}
