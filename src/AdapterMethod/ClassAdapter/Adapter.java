package AdapterMethod.ClassAdapter;

/**
 * Created by Jeremy on 2017/7/3.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }
}
