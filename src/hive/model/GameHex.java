package hive.model;

/**
 * Created by trivo on 2017-03-15.
 */
public interface GameHex {

    //Move a hex to end up connected at hex;direction.
    public void moveHex(GameHex hex, HexDirection direction);


}
