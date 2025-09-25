import java.util.Iterator;
import java.util.ArrayList;

public class MyHashMap <T> implements Iterable<T>{
    ArrayList<GenericQueue<T>> map;
    int currSize = 0;
//    new ArrayList<GenericQueue>();

    public MyHashMap(String key, T value){//constuctor
        this.map = new ArrayList<GenericQueue<T>>(10);
//        map.put(key,value);
    }

    public void put(String key, T value){//might be wrong, idk
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;
        //use hash to decide index // nonneeded hash is index?
        //use hash to check if There exist GQ at index for hash
        if(map.get(hashIndex) != null){
            //add(value, hash)//add to the node at that index
            map.get(hashIndex).add(value,hash);
        }
        else{// if not make new GQ and put at index
            GenericQueue<T> queue = new GenericQueue<T>();
            queue.add(value, hash);
            map.add(hashIndex, queue);
        }
    }

    public boolean contains(String key){
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;
        if(map.get(hashIndex) == null){
            return false;
        }
        return true;
    }

    public T get(String key){
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;

        GenericQueue<T> queue =  map.get(hashIndex);
        if(queue == null){
            return null;
        }
        // return the value at the given key

//        T ret = queue;
        //does not exist ret null
        return null;
    }

    public int size(){
        return currSize;
    }

    public boolean isEmpty(){
        return currSize == 0;
    }

    public T replace(String key, T value){
        //
        return null;
    }

    public Iterator<T> iterator() {
        return new HMIterator<T>(map, currSize);
    }

}
