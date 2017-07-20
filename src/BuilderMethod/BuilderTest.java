package BuilderMethod;

/**
 * Created by Jeremy on 2017/7/3.
 */
public class BuilderTest {

    public static void main(String []args){
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.produceSmsSenders(10);
        for(int i=0;i<builder.senders.size();i++){
            builder.senders.get(i).send();
        }
    }

}
