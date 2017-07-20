package FactoryMethod.AbstractFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
