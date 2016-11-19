/**
 * @author crkimberley on 18/11/2016.
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object value;
    private ErrorMessage message;

    public ReturnObjectImpl(Object value) {
        this.value = value;
        message = ErrorMessage.NO_ERROR;
    }

    public ReturnObjectImpl(ErrorMessage message) {
        this.message = message;
    }

    @Override
    public boolean hasError() {
        return message != ErrorMessage.NO_ERROR;
    }

    @Override
    public ErrorMessage getError() {
        return hasError() ? message : ErrorMessage.NO_ERROR;
    }

    @Override
    public Object getReturnValue() {
        return hasError() ? null : value;
    }
}