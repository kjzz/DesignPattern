package MementoMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class MemetoTest {

    public static void main(String []args){

        Original origi = new Original("ZhangKejie");

        Storage  storage = new Storage(origi.createMemento());

        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());

    }

}
