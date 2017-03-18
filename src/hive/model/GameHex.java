package hive.model;

import hive.structure.AxialCoords;

/**
 * Created by trivo on 2017-03-15.
 */
public abstract class GameHex {

    private AxialCoords coords;

    //Move a hex to position x, y;
    public void moveHex(int x, int y){
        coords.setCoords(x,y);
    }


}
