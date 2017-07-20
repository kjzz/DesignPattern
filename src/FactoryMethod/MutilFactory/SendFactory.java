package FactoryMethod.MutilFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SendFactory {

    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
        return new SmsSender();
    }

}
