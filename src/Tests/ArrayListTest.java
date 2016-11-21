import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class ArrayListTest {
    ArrayList emptyList;
    ArrayList list1Number;
    ArrayList listMillionNumbers;
    ArrayList listNames;

    @Before
    public void setUp() throws Exception {
        emptyList = new ArrayList();
        list1Number = new ArrayList();
        list1Number.add(13);
        listMillionNumbers = new ArrayList();
        for (int i=0; i<1000000; i++) {
            listMillionNumbers.add(i);
        }
        listNames = new ArrayList();
        listNames.add("...");
        listNames.add("amy");
        listNames.add("bill");
        listNames.add("claire");
        listNames.add("derek");
        listNames.add("enid");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyList.isEmpty());
        assertFalse(list1Number.isEmpty());
        assertFalse(listMillionNumbers.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, emptyList.size());
        assertEquals(1, list1Number.size());
        assertEquals(1000000, listMillionNumbers.size());
    }

    @Test
    public void testGetFromEmptyList() {
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(0).getError());
        assertNull(emptyList.get(0).getReturnValue());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(1).getError());
        assertNull(emptyList.get(1).getReturnValue());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(-1).getError());
        assertNull(emptyList.get(-1).getReturnValue());
    }

    @Test
    public void testGetWithOutOfBoundsIndex() {
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, list1Number.get(-1).getError());
        assertNull(list1Number.get(-1).getReturnValue());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, list1Number.get(1).getError());
        assertNull(list1Number.get(1).getReturnValue());
    }

    @Test
    public void testGetWithValidIndices() {
        assertEquals(13, list1Number.get(0).getReturnValue());
        assertEquals("...", listNames.get(0).getReturnValue());
        assertEquals("enid", listNames.get(5).getReturnValue());
        assertEquals(500000, listMillionNumbers.get(500000).getReturnValue());
    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {

    }
}