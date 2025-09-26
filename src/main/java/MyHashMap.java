import java.util.Iterator;
import java.util.ArrayList;

public class MyHashMap <T> implements Iterable<T>{
    ArrayList<GenericQueue> map;
//    new ArrayList<GenericQueue>();

    public MyHashMap(String key, T value){

        map = new ArrayList<GenericQueue>(10);
        for (int i = 0; i < 10; i++){
            map.add(null);
        }
        put(key,value);
    }

    public void put(String key, T value){
        int hash = key.hashCode();
        //use hash to decide index // nonneeded hash is index?
        //use hash to check if There exist GQ at index for hash
        int idx = Math.abs(hash) % map.size();
        while(idx >= map.size()){
            map.add(null);
        }
        if(map.get(idx) != null){
            //add(value, hash)//add to the node at that index
            map.get(idx).add(value, hash);
        }
        else{// if not make new GQ and put at index
            GenericQueue<T> queue = new GenericQueue<T>();
            queue.add(value, hash);
            map.set(idx, queue);
        }
    }

    public boolean contains(String key){
        return false;
    }

    public T get(String key){
        // return the value at the given key

        //does not exist ret null
        return null;
    }

    public int size() {
        int total = 0;
        for (GenericQueue<T> queue : map) {
            if (queue != null) {
                total += queue.getLength();
            }
        }
        return total;
    }


    public boolean isEmpty(){
        return false;
    }

    public T replace(String key, T value){
        //
        return null;
    }

    public Iterator<T> iterator() {
//        return new HMIterator<T>();
        return null;
    }

}
