import java.util.Iterator;
import java.util.ArrayList;

public class HMIterator<T> implements Iterator<T> {//TODO
    private HMIterator<T> iterator;

    public HMIterator(ArrayList<GenericQueue<T>> map, int size) {
//        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return false;
    };
    @Override
    public T next() {
        if(!hasNext()){
            return null;
        }

    return null;
    };

}
