/**
 * @author crkimberley on 18/11/2016.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    @Override
    public ReturnObject head() {
        return get(0);
    }

    @Override
    public FunctionalList rest() {
        FunctionalList restList = new FunctionalArrayList();
        Object[] array = getArray();
        for (int i = 1; i < getSize(); i++) {
            restList.add(array[i]);
        }
        return restList;
    }
}
