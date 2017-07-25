package MementoMethod;

import java.security.PublicKey;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
