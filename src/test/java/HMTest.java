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

//    static MyHashMap hashMap;
//
//    @BeforeAll
//    static void setup() {
////        hashMap;
//    }
//    @BeforeEach
//    void init(){
//        hashMap = new MyHashMap("test", 10);
////        put();
//    }
//
//    @Test
//    void HasConstructorTest(){
////        hashMap = new MyHashMap("test", 10);
//
//        assertEquals(1, hashMap.size(),"hashmap size is 1");
//        assertEquals(false, hashMap.isEmpty(),"hashmap is not empty");
//    }
//
//    @Test
//    void HashMapSizeTest() {
////        assertEquals(1,MyHashMap.size(), "wrong length of hashMap");
//    }
//
//    @Test
//    void getKeyTest(){
////        hashMap = new MyHashMap("test", 10);
//    }
//
//    @Test
//    public void getfuncTest() {
//
//    }
//
//    @Test
//    void putTest(){
//
//    }
//
//    @Test
//    void containsKeyTest(){
//    }
//    @Test
//    void containsValueTest(){
//
//    }
//
//    @Test
//    void replaceKeyTest(){
//    }
//
//    @Test
//    void ForEveryKeyTest(){
//    }
//
//    @Test
//    void collisonTest(){
//    }
static MyHashMap<String> tester1;
    static ArrayList<String> comp1;

    //batch two
    static MyHashMap<String> tester2;
    static ArrayList<String> comp2;

    //batch three
    static MyHashMap<String> tester3;
    static ArrayList<String> comp3;


    @BeforeAll
    static void setup() { //constructor and put test built in, no empty test possible as no empty constuctor
        //batch one, one element
        tester1 = new MyHashMap<String>("Caramel", "pop");
        comp1 = new ArrayList<String>();
        comp1.add("pop");

        //batch two, three elements
        tester2 = new MyHashMap<String>("Cyan", "orange"); //at index 8
        tester2.put("Yellow", "purple"); //at index 7
        tester2.put("Red", "green"); //at index 7
        comp2 = new ArrayList<String>();
        comp2.add("purple");
        comp2.add("green");
        comp2.add("orange");

        //batch three
        tester3 = new MyHashMap<String>("Data", "Bit");
        tester3.put("Pablo", "Kitten");
        tester3.put("David", "Cristie");
        tester3.put("Cool", "Beans");
        tester3.put("Want", "Candy");
        comp3 = new ArrayList<String>();
        comp3.add("Beans");
        comp3.add("Bit");
        comp3.add("Cristie");
        comp3.add("Kitten");
        comp3.add("Candy");

    }

    @Test
    void getTest() {
        //TODO test: first, last, middle, only, not in map
        //
        //batch one
//        assertEquals(tester1.get("Caramel"), "pop", "Incorrect element returned for myHashMap of size 1"); //only
//        assertEquals(tester1.get("Fish"), null, "Incorrect element returned for myHashMap of size 1"); //not in map

        //batch two
        assertEquals(tester2.get("Cyan"), "orange", "Incorrect element returned for myHashMap of size 3"); //last
        assertEquals(tester2.get("Yellow"), "purple", "Incorrect element returned for myHashMap of size 3"); //first
        assertEquals(tester2.get("Red"), "green", "Incorrect element returned for myHashMap of size 3"); //middle
        assertEquals(tester2.get("Fudge"), null, "Incorrect element returned for myHashMap of size 3"); //not in map

//        //batch three
//        assertEquals(tester3.get("Pablo"), "Kitten", "Incorrect return");
//        assertEquals(tester3.get("David"), "Cristie", "Incorrect return");
//        assertEquals(tester3.get("Cool"), "Beans", "Incorrect return");
//        assertEquals(tester3.get("Want"), "Candy", "Incorrect return");
//        assertEquals(tester3.get("KMS"), null, "Incorrect return");
    }



//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4})
//    void parameterTest(int val) {
//    }

}
