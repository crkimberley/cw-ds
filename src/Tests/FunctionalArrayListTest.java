import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class FunctionalArrayListTest {
    FunctionalList emptyList, list1Number, listMillionNumbers, listNames;

    @Before
    public void setUp() throws Exception {
        emptyList = new FunctionalArrayList();
        list1Number = new FunctionalArrayList();
        listMillionNumbers = new FunctionalArrayList();
        listNames = new FunctionalArrayList();
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
    public void testHeadOnEmptyListReturnsEmptyStructureError() {
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, emptyList.head().getError());
    }

    @Test
    public void testHeadReturnsFirstElementInList() {
        assertEquals(13, list1Number.head().getReturnValue());
        assertEquals("...", listNames.head().getReturnValue());
    }

    @Test
    public void testRestOnEmptyListReturnsAnotherEmptyList() {
        assertEquals(0, emptyList.rest().size());
    }

    @Test
    public void testRestReturnsListMinusHead() {
        assertEquals(0, list1Number.rest().size());
        assertEquals("amy", listNames.rest().get(0).getReturnValue());
        assertEquals("claire", listNames.rest().get(2).getReturnValue());
        assertEquals("enid", listNames.rest().get(4).getReturnValue());
    }

    @Test
    public void testBigList() {
        FunctionalList bigList = new FunctionalArrayList();
        for (int i=0; i<2000000; i++) {
            bigList.add(i);
        }
        assertEquals(2000000, bigList.size());
    }
}