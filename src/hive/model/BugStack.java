package hive.model;

import hive.structure.BugHex;
import hive.structure.HexStack;

import java.util.*;

/**
 * Created by trivo on 2017-03-21.
 */
public class BugStack implements HexStack<BugHex>{

    private LinkedList<BugHex> bugStack;


    @Override
    public void push(BugHex hex) {
        bugStack.addLast(hex);
    }

    @Override
    public BugHex pop() {
        return bugStack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return bugStack.isEmpty();
    }

    @Override
    public int stackSize() {
        return bugStack.size();
    }

    public boolean contains(BugHex hex){
        return bugStack.contains(hex);
    }
}
