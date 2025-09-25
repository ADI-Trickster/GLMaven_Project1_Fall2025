import java.util.Iterator;
import java.util.ArrayList;

public class MyHashMap <T> implements Iterable<T>{
    ArrayList<GenericQueue> map;
//    new ArrayList<GenericQueue>();

    public MyHashMap(String key, T value){
        map = new ArrayList<GenericQueue>(10);
        map.put(key,value);
    }

    public void put(String key, T value){
        int hash = key.hashCode();
//        map[0].enqueue();
    }

    public boolean contains(String key){
        return false;
    }

    public T get(String key){
        return null;
    }

    public int size(){
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    public T replace(String key, T value){
        return null;
    }

    public Iterator<T> iterator() {
        return new HMIterator<T>();
    }

}
