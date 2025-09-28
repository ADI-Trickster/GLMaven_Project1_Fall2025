import java.util.Iterator;
import java.util.ArrayList;

public class HMIterator<T> implements Iterator<T> {//TODO Finsish
    private HMIterator<T> iterator;
    private ArrayList<GenericQueue<T>> map;
    private GenericQueue<T> queue;
    private GenericList.Node<T> curr;
    private int index;

    public HMIterator(ArrayList<GenericQueue<T>> map) {
            this.map = map;
            queue = map.get(0);
            curr = queue.getHead();
            index = 0;
    }

    @Override
    public boolean hasNext() {
        if (curr == null && index < 10) {
            index++;
            if(index < 10){
                queue = map.get(index);
                while (queue == null) {
                    index++;
                    queue = map.get(index);
                }
                curr = queue.getHead();
            }
            else{
                return false;
            }
        }
        return curr != null;
    };

    @Override
    public T next() {
        if(!hasNext()){
            return null;
        }
        T ret = curr.data;
        curr = curr.next;
    return ret;
    };

}
