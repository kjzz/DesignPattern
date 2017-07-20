package FactoryMethod.StaticFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SendFactory {

    public static Sender produceMailSender(){
        return new MailSender();
    }

    public static Sender produceSmsSender(){
        return new SmsSender();
    }

}
