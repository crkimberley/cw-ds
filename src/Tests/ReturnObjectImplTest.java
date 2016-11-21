import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 21/11/2016.
 */
public class ReturnObjectImplTest {
    ReturnObject roNoError;
    ReturnObject roEmptyStructure;
    ReturnObject roIndexOutOfBounds;
    ReturnObject roInvalidArgument;
    ReturnObject ro23;
    ReturnObject roDonkey;

    @Before
    public void setUp() throws Exception {
        roNoError = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        roEmptyStructure = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        roIndexOutOfBounds = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        roInvalidArgument = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        ro23 = new ReturnObjectImpl(23);
        roDonkey = new ReturnObjectImpl("Donkey");
    }

    @Test
    public void testHasError() {
        assertFalse(roNoError.hasError());
        assertTrue(roEmptyStructure.hasError());
        assertTrue(roIndexOutOfBounds.hasError());
        assertTrue(roInvalidArgument.hasError());
        assertFalse(ro23.hasError());
        assertFalse(roDonkey.hasError());
    }

    @Test
    public void testGetError() {
        assertEquals(ErrorMessage.NO_ERROR, roNoError.getError());
        assertEquals(ErrorMessage.EMPTY_STRUCTURE, roEmptyStructure.getError());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, roIndexOutOfBounds.getError());
        assertEquals(ErrorMessage.INVALID_ARGUMENT, roInvalidArgument.getError());
        assertEquals(ErrorMessage.NO_ERROR, ro23.getError());
        assertEquals(ErrorMessage.NO_ERROR, roDonkey.getError());
    }

    @Test
    public void testGetReturnValue() {
        assertEquals(23, ro23.getReturnValue());
        assertEquals("Donkey", roDonkey.getReturnValue());
        assertNull(roNoError.getReturnValue());
        assertNull(roEmptyStructure.getReturnValue());
        assertNull(roIndexOutOfBounds.getReturnValue());
        assertNull(roInvalidArgument.getReturnValue());
    }
}