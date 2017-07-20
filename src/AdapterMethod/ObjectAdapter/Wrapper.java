package AdapterMethod.ObjectAdapter;



/**
 * Created by Jeremy on 2017/7/3.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }

}
