//GenericQueue Test cases

/*
. At a minimum, you must write 1 test case per method,
test that you can implement a forEach loop and fully test the constructors for the
GenericQueue and MyHashMap and Node classes. Also test that the
descendingIterator performs as expected.
 */
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

public class GQTest {

    static GenericQueue<Integer> GQ;

    @BeforeAll
    static void setup() {
        GQ.enqueue(15);
    }
//    @BeforeEach
//    void init() {
//    }

//    @Test
//    void QueueSizeSmallTest() {
//        assertEquals(1,GQ.getLength(), "wrong length of GenericQueue");
//        GQ.enqueue(25);
//        assertEquals(2,GQ.getLength(), "wrong length of GenericQueue");
////        assertEquals(2,1, "false test");
//        GQ.dequeue();
//        assertEquals(1,GQ.getLength(), "wrong length of GenericQueue");
//    }
//
//
//    @Test
//    void QueueSizeLargeTest() {
//        assertEquals(1,GQ.getLength(), "wrong length of GenericQueue");
//        GQ.enqueue(25);
//        GQ.enqueue(35);
//        GQ.enqueue(45);
//        GQ.enqueue(55);
//        assertEquals(5,GQ.getLength(), "wrong length of GenericQueue");
//        GQ.dequeue();
//        assertEquals(4,GQ.getLength(), "wrong length of GenericQueue");
//        GQ.dequeue();
//        GQ.dequeue();
//        assertEquals(2,GQ.getLength(), "wrong length of GenericQueue");
//    }
//
//    @Test
//    void QueueSizeFullTest() {}
//
//    @Test
//    void QueueEnqueueTest() {
//        GQ.enqueue(35);
//        GQ.enqueue(25);
//        assertEquals(15,GQ.get(0), "wrong data at index 0 of GenericQueue");
//        assertEquals(35,GQ.get(1), "wrong data at index 1 of GenericQueue");
//        assertEquals(25,GQ.get(2), "wrong data at index 2 of GenericQueue");
//    }
//
//    @Test
//    void QueueDequeueTest() {
//        GQ.enqueue(35);
//        GQ.enqueue(25);
//        assertEquals(3,GQ.getLength(), "wrong length of GenericQueue");
//        assertEquals(15,GQ.get(0), "wrong data at index 0 of GenericQueue");
//        GQ.dequeue();
//        assertEquals(35,GQ.get(0), "wrong data at new index 0 of GenericQueue");
//        GQ.dequeue();
//        assertEquals(25,GQ.get(0), "wrong data at new index 0 of GenericQueue");
//
//        //size should be 1 or 0
//        assertEquals(0,GQ.getLength(), "wrong length of GenericQueue");
//    }
}
