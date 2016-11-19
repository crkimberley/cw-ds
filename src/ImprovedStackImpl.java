/**
 * @author crkimberley on 18/11/2016.
 */
public class ImprovedStackImpl implements ImprovedStack {
    /**
     * Returns a copy of this stack with the items reversed, the top
     * elements on the original stack is at the bottom of the new
     * stack and viceversa.
     *
     * @return a copy of this stack with the items reversed.
     */
    @Override
    public ImprovedStack reverse() {
        return null;
    }

    /**
     * Removes the given object from the stack if it is
     * there. Multiple instances of the object are all removed.
     * <p/>
     * Classes implementing this method must use method .equals() to
     * check whether the item is in the stack or not.
     *
     * @param object the object to remove
     */
    @Override
    public void remove(Object object) {

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
