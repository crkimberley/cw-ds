/**
 * @author crkimberley on 19/11/2016.
 */
public class ListScript {

    public static void main(String[] args) {
        new ListScript().launch();
    }

    private void launch() {
        //ArrayList list = new ArrayList();
        LinkedList list = new LinkedList();
        System.out.println("isEmpty()\t" + list.isEmpty());
        System.out.println("list.size()\t" + list.size());
        System.out.println("list.add(\"alison\")");
        list.add("alison");
        System.out.println("isEmpty()\t" + list.isEmpty());
        System.out.println("list.size()\t" + list.size());
        System.out.println("list.get(0).getReturnValue()\t" + list.get(0).getReturnValue());
        list.remove(0);
        System.out.println("isEmpty()\t" + list.isEmpty());
        System.out.println("list.size()\t" + list.size());

        list.add("amy");
        list.add("bill");
        list.add("claire");
        list.add("debbie");
        list.add("ed");
        list.add("fiona");
        list.add("gareth");
        list.add("harry");
        list.add("ian");
        list.add("jake");

        System.out.println("list.size()\t" + list.size());

        System.out.println("list.add(5, \"fred\")");
        list.add(5, "fred");

        System.out.println("list.size()\t" + list.size());

        list.printList();

        //ArrayList list2 = new ArrayList();
        LinkedList list2 = new LinkedList();
        list2.add(23);
        System.out.println(list.size());
        list2.printList();
        list2.add("and a string");
        System.out.println(list.size());
        list2.printList();

        ArrayList list3 = new ArrayList();
        LinkedList list4 = new LinkedList();
        for (int i=0; i<1000000; i++) {
            list3.add("carrots and peas");
        }
        System.out.println(list3.size());
        for (int i=0; i<1000000; i++) {
            list4.add("carrots and peas");
        }
        System.out.println(list4.size());

        //FunctionalArrayList list5 = new FunctionalArrayList();
        FunctionalLinkedList list5 = new FunctionalLinkedList();
        System.out.println("list5.isEmpty()\t" + list5.isEmpty());
        System.out.println(list5.head().getError());
        list5.add("amy");
        System.out.println("list5.isEmpty()\t" + list5.isEmpty());
        System.out.println(list5.head().getError());
        list5.add("bill");
        list5.add("claire");
        list5.add("debbie");
        list5.add("ed");
        list5.add("fiona");
        list5.add("gareth");
        list5.add("harry");
        list5.add("ian");
        list5.add("jake");
        System.out.println(list5.size());
        list5.remove(9);
        System.out.println(list5.size());
        list5.printList();
        list5.remove(2);
        System.out.println(list5.size());
        System.out.println("FunctionalArrayList - whole list\t");
        list5.printList();
        System.out.println("FunctionalArrayList - head()\t");
        System.out.println(list5.head().getReturnValue());
        System.out.println("FunctionalArrayList - rest()\t");
        //FunctionalArrayList restOfList = (FunctionalArrayList) list5.rest();
        FunctionalLinkedList restOfList = (FunctionalLinkedList) list5.rest();
        restOfList.printList();

        SampleableListImpl list6 = new SampleableListImpl();
        list6.add("amy");
        list6.add("bill");
        list6.add("claire");
        list6.add("debbie");
        list6.add("ed");
        list6.add("fiona");
        list6.add("gareth");
        list6.add("harry");
        list6.add("ian");
        list6.add("jake");
        System.out.println("SampleableList - whole list\t");
        list6.printList();
        System.out.println("SampleableListImpl - sample()\t");
        SampleableListImpl sampleList = (SampleableListImpl) list6.sample();
        sampleList.printList();

        StackImpl stack = new StackImpl(new ArrayList());
        System.out.println("stack.isEmpty()\t" + stack.isEmpty());
        stack.push("andrea");
        stack.push("belinda");
        stack.push("carrie");
        System.out.println("stack.size()\t" + stack.size());
        System.out.println("stack.top()\t" + stack.top().getReturnValue());
        System.out.println("stack.pop()\t" + stack.pop().getReturnValue());
        System.out.println("stack.pop()\t" + stack.pop().getReturnValue());
        System.out.println("stack.pop()\t" + stack.pop().getReturnValue());
        System.out.println("stack.pop()\t" + stack.pop().getError());
    }
}