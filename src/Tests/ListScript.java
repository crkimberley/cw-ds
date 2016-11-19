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

        LinkedList list3 = new LinkedList();
        for (int i=0; i<3000000; i++) {
            list3.add(i);
        }
        System.out.println(list3.size());
    }
}