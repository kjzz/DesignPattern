package DecoratorMethod;

/**
 * Created by Jeremy on 2017/7/3.
 */
public class Decorator implements Sourceable{

    public Sourceable source;

    public Decorator(Sourceable source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Before Decorate!");
        source.method();
        System.out.println("After Decorate!");
    }

}
