import java.util.Iterator;

public class GLLIterator<T> implements Iterator<T>{
    private GenericList.Node<T> curr;

//    GenericList.Node curr =  head;
    //hasNext if head == null ret false
    @Override
    public boolean hasNext() {
        return curr != null;
    }

    //next goes to next and returns current/next data
    @Override
    public T next(){
        if(!hasNext()){
            return null;
        }

        T returnData = curr.data;
        curr = curr.next;
        return returnData;
    }
    //remove

}
