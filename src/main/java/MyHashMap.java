import java.util.Iterator;
import java.util.ArrayList;

public class MyHashMap <T> implements Iterable<T>{
    ArrayList<GenericQueue<T>> map;
//    private GenericQueue<T> queue;

    public MyHashMap(String key, T value){
        map = new ArrayList<GenericQueue<T>>();
        for (int i = 0; i < 10; i++){
            map.add(null);
        }
        put(key,value);
    }


public void put(String key, T value){
    int hash = Math.abs(key.hashCode());
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

    public boolean contains(String key) {//TODO
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;
        if(map.get(hashIndex) == null){
            return false;
        }
        //get that queue of map using get(index)
//        make a node to that can gets the queue head
//        if it finds that code in the queue return true
        return false;
    }

    public T get(String key){
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;
        GenericQueue<T> queue =  map.get(hashIndex);
        if(queue.getHead() == null){
            return null;
        }
        // return the value at the given key
        GenericList.Node<T> curr = queue.getHead();
        while(curr != null){
            if(curr.code == hashIndex ){
                return curr.data;
            }
            curr = curr.next;
        }
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
        return map.size() == 0;
    }

    public T replace(String key, T value){//TODO
        int hash = key.hashCode();
        int hashIndex = key.hashCode() & 9;
        GenericQueue<T> queue =  map.get(hashIndex);
        GenericList.Node<T> curr = queue.getHead();
        while(curr != null){
            if(curr.code == hash){
                //do stuff
            }
            curr = curr.next;
        }
        return null;
    }

    public Iterator<T> iterator() {
        return new HMIterator<T>(map);
    }
}
