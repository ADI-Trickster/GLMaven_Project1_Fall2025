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
    void setHashMapAndSizeTest(){
        assertEquals(1, hashMap.size(), "wrong size of hashMap");
        hashMap.put("osmoC", 12);
        assertEquals(2, hashMap.size(), "wrong size of hashMap");
    }

    @Test
    void containsTest() {
        assertEquals(true ,hashMap.contains("Cosmo"), "wrong key value of hashMap");
    }

    @Test
    void HasConstructorTest(){
        assertEquals(1, hashMap.size(),"hashmap size is 1");
        assertEquals(false, hashMap.isEmpty(),"hashmap is not empty");
    }

    @Test
    void getKeyTest(){
        hashMap.put("Clash", 4);
        hashMap.put("Great", 19);
        hashMap.put("Helps", 1);

        assertEquals(10, hashMap.get("Cosmo"), "wrong value");
        assertEquals(4, hashMap.get("Clash"), "wrong value");
        assertEquals(19, hashMap.get("Great"), "wrong value");
        assertEquals(1, hashMap.get("Helps"), "wrong value");
    }

    @Test
    void putTest(){
        hashMap.put("Clash", 4);
        hashMap.put("Great", 19);

        assertEquals(10, hashMap.get("Cosmo"), "Cosmo value incorrect");
        assertEquals(4, hashMap.get("Clash"), "Clash value incorrect");
        assertEquals(19, hashMap.get("Great"), "Great value incorrect");
    }

    @Test
    void replaceKeyTest(){
        hashMap.put("Coast", 5);
        Integer oldVal = hashMap.replace("Coast", 10); // replace its value

        assertEquals(5, oldVal, "replace should return old value");
        assertTrue(hashMap.contains("Coast"), "key should still exist");

        // check if new value is set
        assertEquals(10, hashMap.get("Coast"), "value should be updated to 10");
    }

    @Test
    void collisonTest(){
        hashMap.put("osmoC", 13);
        hashMap.put("ooC", 11);
        hashMap.put("osC", 10);
        hashMap.put("osoC", 2);
        hashMap.put("BAM", 3);
        hashMap.put("GOOD", 9);
        hashMap.put("Loot", 5);
        hashMap.put("Clash", 4);
        hashMap.put("Royal", 1);
        hashMap.put("Great", 19);
        assertEquals(11 ,hashMap.size(), "collision occures");
    }

}
