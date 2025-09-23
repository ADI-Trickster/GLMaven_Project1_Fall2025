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

    public void add(T data){
        Node<T> toAdd = new Node<T>(data);
        if(getHead() == null){
            this.setHead(toAdd);
            this.tail = toAdd;
        }
        else{
            Node<T> curr =  getHead();
            while(curr.hasNext){
//                curr.next();
            }
            curr.next = toAdd;
            this.tail = curr.next;;
        }
    }

//    @Override
//    public void add(T data, int code){

////        this.code = code;
//    }

    @Override
    public T delete() {
        return null;
    }

    public void enqueue(T data){
//        tail.add(T);
        //tail.next = new Node<T>(T);
//        return null;
    }

    public T dequeue(){
        delete();
        T data = getHead().data;
        setHead(getHead().next);
        return data;
    }

}
