/**
 * @author crkimberley on 18/11/2016.
 *
 * @see FunctionalList
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    @Override
    public ReturnObject head() {
        return get(0);
    }

    @Override
    public FunctionalList rest() {
        FunctionalList restList = new FunctionalArrayList();
        for (int i = 1; i < size(); i++) {
            restList.add(get(i).getReturnValue());
        }
        return restList;
    }
}