package SingleMethod;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SyncSingleton {

    public static SyncSingleton syncSingleton = null;

    private SyncSingleton(){

    }

    public static synchronized SyncSingleton getSyncSingleton(){
        if (syncSingleton==null){
            return new SyncSingleton();
        }
        return syncSingleton;
    }
}
