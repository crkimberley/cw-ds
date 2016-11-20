/**
 * @author crkimberley on 19/11/2016.
 *
 * Some basic tests
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
        System.out.println("SampleableListImpl - sample()\t");
        SampleableListImpl sampleList = (SampleableListImpl) list6.sample();

        StackImpl stack1 = new StackImpl(new ArrayList());
        System.out.println("stack1.isEmpty()\t" + stack1.isEmpty());
        stack1.push("andrea");
        stack1.push("belinda");
        stack1.push("carrie");
        System.out.println("stack1.size()\t" + stack1.size());
        System.out.println("stack1.top()\t" + stack1.top().getReturnValue());
        System.out.println("stack1.pop()\t" + stack1.pop().getReturnValue());
        System.out.println("stack1.pop()\t" + stack1.pop().getReturnValue());
        System.out.println("stack1.pop()\t" + stack1.pop().getReturnValue());
        System.out.println("stack1.pop()\t" + stack1.pop().getError());

        System.out.println("\nImprovedStack stack2 = new ImprovedStackImpl(new ArrayList())");
        ImprovedStack stack2 = new ImprovedStackImpl(new ArrayList());
        System.out.println("stack2.isEmpty()\t" + stack2.isEmpty());
        System.out.println("stack2.push(\"andrea\");stack2.push(\"belinda\");stack2.push(\"carrie\");");
        stack2.push("andrea");
        stack2.push("belinda");
        stack2.push("carrie");
        System.out.println("stack2.size()\t" + stack2.size());
        System.out.println("stack2.top()\t" + stack2.top().getReturnValue());
        System.out.println("stack2.size()\t" + stack2.size());
        System.out.println("stack2.pop()\t" + stack2.pop().getReturnValue());
        System.out.println("stack2.size()\t" + stack2.size());
        System.out.println("stack2.pop()\t" + stack2.pop().getReturnValue());
        System.out.println("stack2.size()\t" + stack2.size());
        System.out.println("stack2.pop()\t" + stack2.pop().getReturnValue());
        System.out.println("stack2.size()\t" + stack2.size());
        System.out.println("stack2.pop()\t" + stack2.pop().getError());
        System.out.println("stack2.size()\t" + stack2.size());
        stack2.push(0);
        System.out.println("stack2.top()\t" + stack2.top().getReturnValue());
        System.out.println("stack2.push(1);stack2.push(2);stack2.push(3);stack2.push(4);stack2.push(5);");
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        System.out.println("stack2.top()\t" + stack2.top().getReturnValue());
        System.out.println("ImprovedStack reverseStack = stack2.reverse()");
        ImprovedStack reverseStack = stack2.reverse();
        System.out.println("pop all stack2 first");
        System.out.println(stack2.pop().getReturnValue());
        System.out.println(stack2.pop().getReturnValue());
        System.out.println(stack2.pop().getReturnValue());
        System.out.println(stack2.pop().getReturnValue());
        System.out.println(stack2.pop().getReturnValue());
        System.out.println(stack2.pop().getReturnValue());

        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());

        ImprovedStack stack3 = new ImprovedStackImpl(new LinkedList());
        System.out.println("stack3.push(\"anchor\");stack3.push(\"barrow\");stack3.push(\"chair\");stack3.push(\"dongle\");stack3.push(\"egg\");");
        stack3.push("anchor");
        stack3.push("barrow");
        stack3.push("chair");
        stack3.push("dongle");
        stack3.push("egg");
        System.out.println("stack3 size(): " + stack3.size());
        System.out.println("stack3.isEmpty(): " + stack3.isEmpty());
        System.out.println("stack3.remove(\"chair\")");
        stack3.remove("chair");
        System.out.println("stack3 size(): " + stack3.size());
        System.out.println("stack3.remove(\"kettle\")");
        stack3.remove("kettle");
        System.out.println("stack3 size(): " + stack3.size());
        System.out.println("stack3.push(\"kettle\")");
        stack3.push("kettle");
        System.out.println("stack3.remove(\"kettle\")");
        stack3.remove("kettle");
        System.out.println("stack3 size(): " + stack3.size());
        reverseStack = stack3.reverse();
        System.out.println("stack3 top: " + stack3.top().getReturnValue());
        System.out.println(stack3.pop().getReturnValue());
        System.out.println(stack3.pop().getReturnValue());
        System.out.println(stack3.pop().getReturnValue());
        System.out.println(stack3.pop().getReturnValue());
        System.out.println(stack3.pop().getReturnValue());
        System.out.println("reverseStack top: " + reverseStack.top().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
        System.out.println(reverseStack.pop().getReturnValue());
    }
}