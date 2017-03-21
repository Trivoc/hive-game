package hive.structure;

/**
 * Created by trivo on 2017-03-15.
 */
public interface HexStack<E> {

    public void push(BugHex hex);

    public BugHex pop();

    public boolean isEmpty();

    public int stackSize();

}
