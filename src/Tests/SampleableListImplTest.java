import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class SampleableListImplTest {
    SampleableList emptyList, list1Number, listMillionNumbers, listNames;

    @Before
    public void setUp() throws Exception {
        emptyList = new SampleableListImpl();
        list1Number = new SampleableListImpl();
        listMillionNumbers = new SampleableListImpl();
        listNames = new SampleableListImpl();
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
    public void testSampleOnEmptyListReturnsEmptyList() {
        assertEquals(0, emptyList.sample().size());
    }

    @Test
    public void testSampleReturnsSampledList() {
        assertEquals("...", listNames.sample().get(0).getReturnValue());
        assertEquals("bill", listNames.sample().get(1).getReturnValue());
        assertEquals("derek", listNames.sample().get(2).getReturnValue());
        assertEquals(3, listNames.sample().size());

        assertEquals(0, listMillionNumbers.sample().get(0).getReturnValue());
        assertEquals(2, listMillionNumbers.sample().get(1).getReturnValue());
        assertEquals(4, listMillionNumbers.sample().get(2).getReturnValue());
        assertEquals(999998, listMillionNumbers.sample().get(499999).getReturnValue());
        assertEquals(500000, listMillionNumbers.sample().size());
    }

    @Test
    public void testBigList() {
        SampleableList bigList = new SampleableListImpl();
        for (int i=0; i<2000000; i++) {
            bigList.add(i);
        }
        assertEquals(2000000, bigList.size());
    }
}