package hive.model;

import hive.structure.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by trivo on 2017-03-21.
 */
public class Hive implements HexGraph {

    //Nodes
    private HashMap<AxialCoords, HexStack> nodesMap;

    //TODO: Evaluate edge implementation!
    //Edges... put double links from each hexstack instead?
    //Easier to remove from a shared edge than iterate all neighbours?
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
        nodesMap.put(coords, newHex);
        addEdges(coords);

        return true;
    }


    //Adds edges to the hex specified at coordinates coords
    private void addEdges(AxialCoords coords){
        HexStack neighbour;
        //TODO: Hard code neighbours instead? Probably easier to read and less lines either way.
        for(int x = -1; x <= 1; x++){
            for(int y = -1; y <= 1; y++){
                if(x != y){
                    //debug (seems ok): System.out.println("Added: x+" + x + ", y+" + y );
                    neighbour = nodesMap.get(new AxialCoords
                            (coords.getX() + x, coords.getY() + y));
                    //TODO: Add method for checking for neighbours or create new, empty stacks from them
                }
            }
        }
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
