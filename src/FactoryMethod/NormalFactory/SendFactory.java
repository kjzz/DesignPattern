package FactoryMethod.NormalFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SendFactory {

    public Sender produce(String type){
        Sender sender = null;
        switch (type){
            case "sms":
                sender = new SmsSender();
                break;
            case "mail":
                sender = new MailSender();
                break;
            default:
                System.out.println("Cannot support this type sender!");
                break;
        }
        return sender;
    }

}
