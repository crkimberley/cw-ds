/**
 * @author crkimberley on 18/11/2016.
 */
public class LinkedList implements List {

    private Node head = new Node(), tail = head;
    private int size = 0;

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
        return new ReturnObjectImpl(nodeBeforeIndexNode(index).next.value);
    }

    @Override
    public ReturnObject remove(int index) {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        Node temp = nodeBeforeIndexNode(index);
        ReturnObject returnObject = new ReturnObjectImpl(temp.next.value);
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
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
        Node newNode = new Node(item);
        Node temp = nodeBeforeIndexNode(index);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    @Override
    public ReturnObject add(Object item) {
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        Node newNode = new Node(item);
        tail.next = newNode;
        tail = newNode;
        size++;
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    protected static class Node {
        private Object value;
        private Node next = null;

        public Node() {}

        public Node(Object value) {
            this.value = value;
        }
    }

    private Node nodeBeforeIndexNode(int index) {
        Node temp = head;
        for (int count = 0; count < index; count++) {
            temp = temp.next;
        }
        return temp;
    }

    // FOR TESTING
    public void printList() {
        for (Node temp = head.next; temp != null; temp = temp.next) {
            System.out.println(temp.value);
        }
    }
}