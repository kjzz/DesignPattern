package SingleMethod;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class EasySingleton {

    public static EasySingleton instance = null;

    private EasySingleton(){

    }

    public static EasySingleton getSingleton(){
        if(instance == null){
            instance = new EasySingleton();
        }
        return instance;
    }

}
