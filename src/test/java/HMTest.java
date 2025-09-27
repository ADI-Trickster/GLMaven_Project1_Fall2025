//MyHashMap Test cases

/*
. At a minimum, you must write 1 test case per method,
test that you can implement a forEach loop and fully test the constructors for the
GenericQueue and MyHashMap and Node classes. Also test that the
descendingIterator performs as expected.
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HMTest {

    static MyHashMap<Integer> hashMap;

    @BeforeAll
    static void setup() {}

    @BeforeEach
    void init() {
        hashMap = new MyHashMap<>("Cosmo", 10);
    }

    @Test
    void setHashMapTest(){
        assertEquals(1, hashMap.size(), "wrong size of hashMap");
        hashMap.put("osmoC", 12);
        assertEquals(2, hashMap.size(), "wrong size of hashMap");
    }

//    @Test
//    void containsTest() {
//        assertEquals(true ,hashMap.contains("Cosmo"), "wrong key value of hashMap");
//    }

//    @Test
//    void putTest(){}

//    @Test
//    void HashMapSizeTest() {
////        assertEquals(0,MyHashMap.getLength(), "wrong length of hashMap");
////        assertEquals(2,1, "false test");
//    }
//
//    @Test
//    public void test1Test() {
//    }

//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4})
//    void parameterTest(int val) {
//    }

}
