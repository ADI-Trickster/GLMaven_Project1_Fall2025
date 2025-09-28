import java.util.Iterator;

public class ReverseGLLIterator<T> implements Iterator<T> {//TODO
    private int index;
    private GenericList<T> list;

    //don't use nodes use indexes for this
    public ReverseGLLIterator(GenericList<T> head) {
        list = head;
        index = list.getLength() - 1;
    }

    //    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        }
        return false;
    }

    public T next() {
        //check if it has next
        if(hasNext()){
            return null;
        }
        T data = list.get(index);//get() data at index
        index--;
        return data;
    }
}
