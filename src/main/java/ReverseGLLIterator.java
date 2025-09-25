import java.util.Iterator;
public class ReverseGLLIterator<T> implements Iterator<T> {
    private int index;

    //don't use nodes use indexes for this
    public ReverseGLLIterator() {

    }


//    @Override
    public boolean hasNext() {
        return false;
    }

    public T next(){
        //check if it has next
        T data = null;//get() data at index
//        index--;
        return  data;
    }
}
