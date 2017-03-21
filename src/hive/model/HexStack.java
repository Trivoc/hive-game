package hive.model;

import hive.structure.AxialCoords;

/**
 * Created by trivo on 2017-03-15.
 */
public interface HexStack {

    public void push();

    public void pop();

    public boolean isEmpty();

    public int stackSize();

}
