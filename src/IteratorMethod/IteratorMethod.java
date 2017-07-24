package IteratorMethod;

/**
 * Created by Jeremy on 2017/7/24.
 * 迭代子模式
 */
public class IteratorMethod {
    public static void  main(String args[]){
        Collection collection = new MyCollection();
        Iterator iterator =collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.Next());
        }
    }
}
