import java.util.ArrayList;
import java.util.Iterator;

//
public abstract class GenericList<T> implements Iterable<T>{
    private Node<T> head;
    private int length;

    public class Node<T> {
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

        public Node(T data, int code ,Node<T> next) {
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
        ArrayList<T> res = new ArrayList<T>();
        Node<T> current = head;
        while (current != null) {
    //          add data to list
        }
        return res;
    }

    ;

    public T get(int index) {
        //check within bounds
        if (index < 0 || index >= length) {
            return null;
        }


        //for loop to get to index
        // return that data
        return head.data;//use
    }

    public T set(int index, T data) {
        //check within bounds
        if (index < 0 || index >= length) {
            return null;
        }

        //for loop to get to index
        // save that data
        //change it
        //return saved
        return head.data = data;
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

    public void setHead(Node<T> newhead) {
        this.head = newhead;
    }

    public Iterator<T> descendingIterator() {

        return null;
    }
}
