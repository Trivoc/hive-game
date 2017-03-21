package hive.structure;

import hive.model.HexStack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by trivo on 2017-03-21.
 */
public class Hive implements HexGraph {

    //Nodes
    private HashMap<AxialCoords, HexStack> nodesMap;

    //Edges
    private ArrayList<Edge> edges;


    //Can't place a
    @Override
    public boolean addHex(HexStack newHex, int x, int y) {
        AxialCoords coords = new AxialCoords(x, y);
        HexStack stack = nodesMap.get(coords);
        if(stack == null) {
            System.out.println("Can't add outside hive!");
            return false;
        } else if (stack.isEmpty()){
            System.out.println("Can't add to a stack when placing hexes!");
            return false;
        }

        nodesMap.put(new AxialCoords(x, y), newHex);
        return true;
    }

    @Override
    public boolean moveHex(HexStack existingHex, int x, int y) {
        return false;
    }

    @Override
    public boolean moveHex(int oldX, int oldY, int newX, int newY) {
        return false;
    }

    @Override
    public boolean removeHex(int x, int y) {
        return false;
    }
}
