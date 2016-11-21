import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class ArrayListTest {
    ArrayList emptyList;
    ArrayList list1Number;
    ArrayList millionStrings;
    ArrayList listNames;

    @Before
    public void setUp() throws Exception {
        emptyList = new ArrayList();
        list1Number = new ArrayList();
        list1Number.add(13);
        millionStrings = new ArrayList();
        for (int i=0; i<1000000; i++) {
            millionStrings.add("monkey");
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
        assertFalse(millionStrings.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, emptyList.size());
        assertEquals(1, list1Number.size());
        assertEquals(1000000, millionStrings.size());
    }

    @Test
    public void testGet() {
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(0).getError());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(1).getError());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(-1).getError());
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