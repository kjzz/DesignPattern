package SingleMethod;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class SyncInstanceSingleton {

    public static SyncInstanceSingleton syncInstanceSingleton = null;

    private SyncInstanceSingleton(){

    }

    public static SyncInstanceSingleton getSyncInstanceSingleton(){

        if(syncInstanceSingleton==null){
            synchronized (syncInstanceSingleton){
                if (syncInstanceSingleton==null){
                    return new SyncInstanceSingleton();
                }
            }
        }
        return syncInstanceSingleton;

    }

}
