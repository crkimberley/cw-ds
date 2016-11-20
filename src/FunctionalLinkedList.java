/**
 * @author crkimberley on 18/11/2016.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    @Override
    public ReturnObject head() {
        return get(0);
    }

    @Override
    public FunctionalList rest() {
        FunctionalList restList = new FunctionalLinkedList();
        for (int i = 1; i < size(); i++) {
            restList.add(get(i).getReturnValue());
        }
        return restList;
    }
}