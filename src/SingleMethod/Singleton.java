package SingleMethod;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class Singleton {

    private Singleton(){

    }

    //单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    public Singleton getSingleton(){
        return SingletonFactory.singleton;
    }
}
