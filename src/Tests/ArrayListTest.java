import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class ArrayListTest {
    List emptyList, list1Number, listMillionNumbers, listNames;

    @Before
    public void setUp() throws Exception {
        emptyList = new ArrayList();
        list1Number = new ArrayList();
        listMillionNumbers = new ArrayList();
        listNames = new ArrayList();
        list1Number.add(13);
        for (int i=0; i<1000000; i++) {
            listMillionNumbers.add(i);
        }
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
    public void testGetFromEmptyListReturnsAppropriateErrorMessage() {
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(0).getError());
        assertNull(emptyList.get(0).getReturnValue());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(1).getError());
        assertNull(emptyList.get(1).getReturnValue());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.get(-1).getError());
        assertNull(emptyList.get(-1).getReturnValue());
    }

    @Test
    public void testGetWithOutOfBoundsIndexReturnsAppropriateErrorMessage() {
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
    public void testRemoveFromEmptyListReturnsAppropriateErrorMessage() {
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.remove(0).getError());
        assertNull(emptyList.remove(0).getReturnValue());
    }

    @Test
    public void testRemoveWithOutOfBoundsIndexReturnsAppropriateErrorMessage() {
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, list1Number.remove(1).getError());
        assertNull(list1Number.remove(1).getReturnValue());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, list1Number.remove(-1).getError());
        assertNull(list1Number.remove(-1).getReturnValue());
    }

    @Test
    public void testRemoveThenCheckSize() {
        assertEquals(13, list1Number.remove(0).getReturnValue());
        assertEquals(0, list1Number.size());
        assertEquals("derek", listNames.remove(4).getReturnValue());
        assertEquals(5, listNames.size());
        assertEquals("claire", listNames.remove(3).getReturnValue());
        assertEquals(4, listNames.size());
        assertEquals("enid", listNames.remove(3).getReturnValue());
        assertEquals(3, listNames.size());
    }

    @Test
    public void testAddNullReturnsInvalidArgumentError() {
        assertEquals(true, listNames.add(null).hasError());
        assertEquals(ErrorMessage.INVALID_ARGUMENT, listNames.add(null).getError());
    }

    @Test
    public void testAddToEmptyListThenGetAndCheckSize() {
        assertEquals(ErrorMessage.NO_ERROR, emptyList.add("cucumber").getError());
        assertEquals("cucumber", emptyList.get(0).getReturnValue());
        assertEquals(1, emptyList.size());
    }

    @Test
    public void testAddToEndOfListThenGetAndCheckSize() {
        assertEquals(ErrorMessage.NO_ERROR, listNames.add("cucumber").getError());
        assertEquals("cucumber", listNames.get(6).getReturnValue());
        assertEquals(7, listNames.size());
    }

    @Test
    public void testAddWithOutOfBoundsIndexReturnsAppropriateErrorMessage() {
        assertEquals(true, listNames.add(-1, "peanut").hasError());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, listNames.add(-1, "peanut").getError());
        assertEquals(true, listNames.add(6, "peanut").hasError());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, listNames.add(6, "peanut").getError());
    }

    @Test
    public void testAddWithCorrectIndexUpdatesLaterIndices() {
        assertEquals("claire", listNames.get(3).getReturnValue());
        assertEquals(ErrorMessage.NO_ERROR, listNames.add(2, "beth").getError());
        assertEquals("claire", listNames.get(4).getReturnValue());
    }

    @Test
    public void testBigList() {
        List bigList = new ArrayList();
        for (int i=0; i<2000000; i++) {
            bigList.add(i);
        }
        assertEquals(2000000, bigList.size());
    }
}