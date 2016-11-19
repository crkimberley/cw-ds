/**
 * @author crkimberley on 18/11/2016.
 */
public class StackImpl extends AbstractStack {

    public StackImpl(List list) {
        super(list);
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the number of items currently in the stack.
     *
     * @return the number of items currently in the stack
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Adds an element at the top of the stack.
     *
     * @param item the new item to be added
     */
    @Override
    public void push(Object item) {

    }

    /**
     * Returns the element at the top of the stack. The stack is
     * left unchanged.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     * stack is empty, an appropriate error.
     */
    @Override
    public ReturnObject top() {
        return null;
    }

    /**
     * Returns the element at the top of the stack. The element is
     * removed frmo the stack.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     * stack is empty, an appropriate error.
     */
    @Override
    public ReturnObject pop() {
        return null;
    }
}
