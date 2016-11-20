/**
 * @author crkimberley on 18/11/2016.
 */
public class SampleableListImpl extends ArrayList implements SampleableList {

    @Override
    public SampleableList sample() {
        SampleableList sampleList = new SampleableListImpl();
        for (int i = 0; i < size(); i = i + 2) {
            sampleList.add(get(i).getReturnValue());
        }
        return sampleList;
    }
}
