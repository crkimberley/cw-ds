/**
 * @author crkimberley on 18/11/2016.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
    /**
     * Returns the element at the beginning of the list.
     * <p/>
     * If the list is empty, an appropriate error is returned.
     *
     * @return a copy of the element at the beginning of the list or
     * an error if the list is empty.
     */
    @Override
    public ReturnObject head() {
        return null;
    }

    /**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list.
     * <p/>
     * If the list is empty, another empty list is returned.
     */
    @Override
    public FunctionalList rest() {
        return null;
    }
}
