package hive.model;

import hive.structure.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by trivo on 2017-03-21.
 */
public class Hive {

    //TODO: Should hexstacks themselves have coordinates instead?
    //TODO: Evaluate edge implementation!
    private HashMap<AxialCoords, HexStack> nodesMap;
    private ArrayList<Edge> edges;

    public Hive(){
        nodesMap = new HashMap<>();
        edges = new ArrayList<>();
    }


    //Place new hex on the board
    public boolean addHex(BugHex newHex, int x, int y) {

        if(nodesMap.isEmpty()){
            AxialCoords firstCoords = new AxialCoords(x,y);
            nodesMap.put(firstCoords, new BugStack(newHex));
            addEdges(firstCoords);
            return true;
        }

        AxialCoords coords = new AxialCoords(x, y);
        HexStack stack = nodesMap.get(coords);

        if(stack == null) {
            System.out.println("Can't add outside hive!");
            return false;
        } else if (!stack.isEmpty()){
            System.out.println("Can't add to a stack when placing hexes!");
            return false;
        }

        nodesMap.get(coords).push(newHex);
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

                    if(!nodesMap.get(coords).isEmpty() && neighbour == null){
                        AxialCoords newStackCoords = new AxialCoords(x, y);
                        nodesMap.put(newStackCoords, new BugStack());
                        addEdges(newStackCoords);
                    } else if (neighbour != null){
                        edges.add(new Edge(nodesMap.get(coords), neighbour));
                    }
                }
            }
        }
    }


    public boolean moveHex(HexStack existingHex, int x, int y) {
        return false;
    }

    public boolean moveHex(int oldX, int oldY, int newX, int newY) {
        return false;
    }

    public boolean removeHex(int x, int y) {
        return false;
    }

    public HexStack getHexStack(int x, int y){
        return nodesMap.get(new AxialCoords(x, y));
    }

    public void printHive(){
        HivePrinter.printHive(nodesMap);

    }

    /**
     * Created by trivo on 2017-03-23.
     */
    private static class HivePrinter {

        public static void printHive(HashMap<AxialCoords, HexStack> nodesMap){

            Object[] keys = nodesMap.keySet().toArray();
            AxialCoords coords[] = new AxialCoords[keys.length];
            for(int i = 0; i < keys.length; i++){
                coords[i] = (AxialCoords)keys[i];
            }

            //TODO: Sort this from top left -> Bottom right (x increasing, y decreasing)
            int xmin = 0;
            int xmax = 0;
            int ymin = 0;
            int ymax = 0;

            for(AxialCoords coordinate : coords){
                xmin = Math.min(coordinate.getX(), xmin);
                xmax = Math.max(coordinate.getX(), xmax);
                ymin = Math.min(coordinate.getY(), ymin);
                ymax = Math.max(coordinate.getY(), ymax);
                System.out.println("Hex at: " + coordinate.getX() + "," + coordinate.getY());
            }



        }
    }
}
