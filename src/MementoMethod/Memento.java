package MementoMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class Memento {

    private String value;

    public Memento(String value){
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
