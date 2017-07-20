package PrototypeMethod;

import java.io.*;

/**
 * Created by Jeremy on 2017/7/3.
 */
public class Prototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 1L;

    private String string;

    private SerializableObject serializableObject;
    //浅复制
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {

        //写入当先对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }
}

class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
}