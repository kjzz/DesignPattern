package VistorMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class MyVistor implements Vistor {
    @Override
    public void visit(Subject subject) {
        System.out.println(subject.getSubject());
    }
}
