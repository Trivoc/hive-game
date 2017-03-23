package hive.model;
import hive.structure.BugType;

import java.awt.*;

/**
 * Created by trivo on 2017-03-21.
 */
public class BugHex {

    private BugType type;
    private Color color;

    public BugHex(BugType type, Color color){
        this.type = type;
        this.color = color;
    }

    public BugHex(BugHex hex){
        this.type = hex.getBugType();
        this.color = hex.getColor();
    }

    public BugType getBugType(){
        return type;
    }

    public Color getColor(){
        return color;
    }
}
