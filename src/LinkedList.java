/**
 * @author crkimberley on 18/11/2016.
 */
public class LinkedList implements List {

    private Node head = new Node();
    private Node tail = head;
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
        Node temp = head.getNext();
        for (int count = 0; count < index; count++) {
            temp = temp.getNext();
        }
        return new ReturnObjectImpl(temp.getValue());
    }

    @Override
    public ReturnObject remove(int index) {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        Node temp = head;
        for (int count = 0; count < index; count++) {
            temp = temp.getNext();
        }
        if (temp.getNext().getNext() == null) {
            tail = temp;
        }
        ReturnObject returnObject = new ReturnObjectImpl(temp.getNext().getValue());
        temp.setNext(temp.getNext().getNext());
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
        Node temp = head;
        for (int count = 0; count < index; count++) {
            temp = temp.getNext();
        }
        Node newNode = new Node(item);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
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

    private static class Node {
        private Object value;
        private Node next = null;

        public Node() {}

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node node) {
            next = node;
        }
    }

    // FOR TESTING
    public void printList() {
        for (Node temp = head.getNext(); temp != null; temp = temp.getNext()) {
            System.out.println(temp.getValue());
        }
    }
}