package AdapterMethod.ClassAdapter;

/**
 * Created by Jeremy on 2017/7/3.
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
public class AdapterTest {

    public static void main(String []args){
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
