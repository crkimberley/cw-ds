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
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseStack.push(list.get(i).getReturnValue());
        }
        return reverseStack;
    }

    @Override
    public void remove(Object object) {
        for (int i = 0; i < list.size(); i++) {
            if (object.equals(list.get(i).getReturnValue())) {
                list.remove(i);
            }
        }
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