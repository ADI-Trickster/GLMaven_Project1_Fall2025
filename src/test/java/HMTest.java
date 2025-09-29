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
import java.util.Iterator;
import java.util.ArrayList;


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

    @Test
    void containsTest() {
        assertEquals(true ,hashMap.contains("Cosmo"), "wrong key value of hashMap");
    }

    @Test
    void putTest(){


    @Test
    void HasConstructorTest(){
//        hashMap = new MyHashMap("test", 10);

        assertEquals(1, hashMap.size(),"hashmap size is 1");
        assertEquals(false, hashMap.isEmpty(),"hashmap is not empty");
    }

    @Test
    void HashMapSizeTest() {
//        assertEquals(1,MyHashMap.size(), "wrong length of hashMap");
    }

    @Test
    void getKeyTest(){
//        hashMap = new MyHashMap("test", 10);
    }

    @Test
    public void getfuncTest() {

    }

    @Test
    void putTest(){

    }

    @Test
    void containsKeyTest(){
    }
    @Test
    void containsValueTest(){

    }

    @Test
    void replaceKeyTest(){
    }

    @Test
    void ForEveryKeyTest(){
    }

    @Test
    void collisonTest(){
    }



//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4})
//    void parameterTest(int val) {
//    }

}
