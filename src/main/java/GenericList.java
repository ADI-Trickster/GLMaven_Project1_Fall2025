import java.util.ArrayList;
import java.util.Iterator;
//
public abstract class GenericList<T> implements Iterable<T> {
    private Node<T> head;
    private int length;

    public static class Node<T> {
        T data;
        int code;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.code = 0;
            this.next = null;
        }

        public Node(T data, int code) {
            this.data = data;
            this.code = code;
            this.next = null;
        }

        public Node(T data, int code, Node<T> next) {
            this.data = data;
            this.code = code;
            this.next = next;
        }
    }

    public void print() {
        if (length == 0) {
            System.out.println("Empty List");
            return;
        }

        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public abstract void add(T data);
    public abstract T delete();

    public ArrayList<T> dumpList() {
        ArrayList<T> ret = new ArrayList<>();

        Node<T> current = head;
        while (current != null) {
            //add data to list
            ret.add(current.data);
            current = current.next;
        }
        return ret;
    }

    public T get(int index) {
        //check within bounds
        if (index < 0 || index >= length) {
            return null;
        }

        //for loop to get to index
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        // return that data
        return curr.data;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= length) { //check within bounds
            return null;
        }
        //for loop to get to index
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        T ret = curr.data;// save that data
        curr.data = data;//change it
        return ret;//return saved
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> newHead) {
        this.head = newHead;
    }

    public Iterator<T> descendingIterator(){
        return new ReverseGLLIterator<T>();
    }
    public Iterator<T> iterator() {
        return new GLLIterator<T>(getHead());
    }
}
