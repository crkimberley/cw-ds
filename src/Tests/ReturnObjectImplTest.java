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

    @Before
    public void setUp() throws Exception {
        roNoError = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        roEmptyStructure = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        roIndexOutOfBounds = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        roInvalidArgument = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
    }

    @Test
    public void testHasError() throws Exception {
        assertFalse(roNoError.hasError());
        assertTrue(roEmptyStructure.hasError());
        assertTrue(roIndexOutOfBounds.hasError());
        assertTrue(roInvalidArgument.hasError());
    }

    @Test
    public void testGetError() throws Exception {

    }

    @Test
    public void testGetReturnValue() throws Exception {

    }
}