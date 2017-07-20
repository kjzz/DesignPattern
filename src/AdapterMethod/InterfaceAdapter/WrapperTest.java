package AdapterMethod.InterfaceAdapter;

/**
 * Created by Jeremy on 2017/7/3.
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class WrapperTest  {

    public static void main(String []args){
        Targetable targetable1 = new Wrapper1();

        Targetable targetable2 = new Wrapper2();

        targetable1.method1();
        targetable1.method2();
        targetable2.method1();
        targetable2.method2();
    }

}
