package BuilderMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 2017/7/3.
 * 工厂模式就是创建单个类的模式,而建造者模式,则是将各种产品进行集中管理,用来创建符合对象。
 */
public class Builder {
    public List<Sender> senders = new ArrayList<Sender>();

    public void produceSmsSenders(int count){
        for(int i = 0;i<count;i++){
            senders.add(new SmsSender());
        }
    }

    public void produceMailSender(int count){
        for(int i = 0;i < count;i++){
            senders.add(new MailSender());
        }
    }
}
