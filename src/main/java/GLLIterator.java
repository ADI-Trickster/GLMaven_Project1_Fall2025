import java.util.Iterator;
import java.util.NoSuchElementException;

public class GLLIterator<T> implements Iterator<T> {
    private GenericList.Node<T> curr;

    public GLLIterator(GenericList.Node<T> head) {
        this.curr = head;
    }

    //    GenericList.Node curr =  head;
    //hasNext if head == null ret false
    //@Override
    public boolean hasNext() {
        if (curr.next != null) {
            return true;
        }
        return false;
    }

    //next goes to next and returns current/next data
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("does not exist");
        }
        T returnData = curr.data;
        curr = curr.next;
        return returnData;
    }
}