package hive.structure;

import hive.model.HexStack;

/**
 * Created by trivo on 2017-03-15.
 */
public interface HexGraph {


    //add new hex at x, y. Returns true if possible
    boolean addHex(HexStack newHex, int x, int y);

    //Tries to move a hex to a new position, returns true if possible
    boolean moveHex(HexStack existingHex, int x, int y);

    boolean moveHex(int oldX, int oldY, int newX, int newY);

    boolean removeHex(int x, int y);



}
