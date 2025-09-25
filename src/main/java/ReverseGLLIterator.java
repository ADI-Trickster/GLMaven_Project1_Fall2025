import java.util.Iterator;
public class ReverseGLLIterator<T> implements Iterator<T> {

    private int index;


//    @Override
    public boolean hasNext() {
        return index>0;
    }

    public T next(){
        //check if it has next
        T data = null;//get() data at index
        index--;
        return  data;
    }
}
