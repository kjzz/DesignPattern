package VistorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class MySubject implements Subject {


    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    @Override
    public String getSubject() {
        return "Hello World!";
    }
}
