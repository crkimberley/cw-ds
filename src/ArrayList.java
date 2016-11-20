/**
 * @author crkimberley on 18/11/2016.
 */
public class ArrayList implements List {

    private int INITIAL_LENGTH = 10;
    private Object[] array = new Object[INITIAL_LENGTH];
    private int size = 0;

    public ArrayList() {}

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ReturnObject get(int index) {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        return new ReturnObjectImpl(array[index]);
    }

    @Override
    public ReturnObject remove(int index) {
        ReturnObject returnObject = get(index);
        if (!returnObject.hasError()) {
            shiftArrayUpAfterRemove(index);
            size--;
        }
        return returnObject;
    }

    @Override
    public ReturnObject add(int index, Object item) {
        if (index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        doubleArrayLengthIfFull();
        shiftArrayDownBeforeAdd(index);
        array[index] = item;
        size++;
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    @Override
    public ReturnObject add(Object item) {
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        doubleArrayLengthIfFull();
        array[size] = item;
        size++;
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    private void doubleArrayLengthIfFull() {
        if (size == array.length - 1) {
            Object[] tempArray = new Object[size * 2];
            for (int i=0; i<array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    private void shiftArrayUpAfterRemove(int index) {
        for (int i=index; i<size-1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
    }

    private void shiftArrayDownBeforeAdd(int index) {
        for (int i=size; i>index; i--) {
            array[i] = array[i-1];
        }
    }

    // FOR TESTING
    public void printList() {
        for (int i=0; array[i] != null; i++) {
            System.out.println(get(i).getReturnValue());
        }
    }
}