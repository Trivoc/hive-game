package hive.structure;

import hive.model.HexStack;

/**
 * Created by trivo on 2017-03-21.
 */

public class Edge {

    private final HexStack firstHex;
    private final HexStack secondHex;

    public Edge(HexStack firstHex, HexStack secondHex) {
        this.firstHex = firstHex;
        this.secondHex = secondHex;
    }

    public HexStack getFirstHex(){
        return firstHex;
    }

    public HexStack getSecondHex(){
        return secondHex;
    }

}