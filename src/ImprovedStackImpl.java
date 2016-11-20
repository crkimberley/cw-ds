/**
 * @author crkimberley on 18/11/2016.
 */
public class ImprovedStackImpl implements ImprovedStack {

    private List list;

    public ImprovedStackImpl(List list) {
        this.list = list;
    }

    @Override
    public ImprovedStack reverse() {
        ImprovedStack reverseStack = new ImprovedStackImpl(new ArrayList());
        for (int i = 0; i < list.size(); i++) {
            reverseStack.push(list.get(i));
        }
        return reverseStack;
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

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(Object item) {
        list.add(item);
    }

    @Override
    public ReturnObject top() {
        return list.get(size() - 1);
    }

    @Override
    public ReturnObject pop() {
        return list.remove(size() - 1);
    }
}