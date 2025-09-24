
public class GenericQueue<T> extends GenericList<T>{
    Node<T> tail;

//    class GenericNode<T>{
//        T data;
//        GenericNode<T> next;
////        this.setHead(T);
////        tail = T;
//    }

    public GenericQueue(){//basic constuc
        this.tail = null;
        this.setHead(null);
        this.setLength(0);
    }

    public GenericQueue(Node<T> data){//constuc w/ one data
        this.tail = data;
        this.setHead(data);
        this.setLength(1);
    }

    @Override
    public void add(T data){
        Node<T> toAdd = new Node<T>(data);
        if(getHead() == null){
            this.setHead(toAdd);
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

//    @Override
    public T delete() {
        //check null
        if(tail == null){
            return null;
        }

        Node<T> toDelete = getHead();
        T data = getHead().data;

        //check if only one
        if(getHead().next == null){
            setHead(null);
            this.tail = null;
            setLength(0);
            return data;
        }
        //set tail to 2nd last
        //updates 2nd.next to null


        setHead(getHead().next);
        setLength(getLength() - 1);
        return data;
    }

    public void enqueue(T data){
        this.add(data);
    }

    public T dequeue(){
        return this.delete();
    }

}
