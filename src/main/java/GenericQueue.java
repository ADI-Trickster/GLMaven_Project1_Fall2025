import java.util.Iterator;
public class GenericQueue<T> extends GenericList<T>{
    private Node<T> tail;

    public GenericQueue(){//basic constuc
        this.tail = null;
        setHead(null);
        setLength(0);
    }
    public GenericQueue(T data){//constuc w/ one data
        Node<T> newData = new Node<T>(data);
        this.tail = newData;
        setHead(newData);
        setLength(1);
    }

    public GenericQueue(Node<T> data){//constuc w/ one data
        this.tail = data;
        setHead(data);
        setLength(1);
    }

//    @Override
    public void add(T data){
        Node<T> toAdd = new Node<T>(data);
        if(getHead() == null){
            setHead(toAdd);
            this.tail = toAdd;
        }
        else{
            tail.next = toAdd;
            this.tail = toAdd;
        }
        this.setLength(this.getLength() + 1);
    }

//    @Override
    public void add(T data, int code){
        Node<T> toAdd = new Node<T>(data);
        if(getHead() == null){
            this.setHead(toAdd);
            this.tail = toAdd;
        }
        else{
            tail.next = toAdd;
            this.tail = toAdd;;
        }
        this.getHead().code = code;
        this.setLength(this.getLength() + 1);
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> newTail ) {
        this.tail = newTail;
    }

//    @Override
    public T delete() {
        //check null
        if(tail == null){
            return null;
        }

        T toDelete;
        //check if only one
        if(getHead() == tail){
            toDelete = tail.data;
            tail = tail.next;
            setHead(null);
        }
        else{
            Node<T> current = getHead();
            while(current.next.next != null) {
                current = current.next;
            }
            toDelete = current.data;
            current.next = null; //updates 2nd.next to null
            tail = current; //set tail to 2nd last
            }

        setLength(getLength() - 1);
        return toDelete;
    }

    public void enqueue(T data){
        this.add(data);
    }

    public T dequeue(){
        return delete();
    }

}
