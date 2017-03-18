package hive.structure;

import hive.model.GameHex;

import java.util.Set;

/**
 * Created by trivo on 2017-03-15.
 */
public interface HexGraph {

    boolean checkConnectivity();

    //add new hex at x, y. Returns true if possible
    boolean addHex(GameHex newHex, int x, int y);


    //Tries to move a hex to a new position
    boolean moveHex(GameHex existingHex, int x, int y);

    boolean moveHex(int oldX, int oldY, int newX, int newY);

}
