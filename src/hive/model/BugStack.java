package hive.model;

import hive.structure.HexStack;

import java.util.*;

/**
 * Created by trivo on 2017-03-21.
 */
public class BugStack implements HexStack<BugHex>{

    private LinkedList<BugHex> bugStack;

    public BugStack(){
        bugStack = new LinkedList<>();
    }

    public BugStack(BugHex firstHex){
        bugStack = new LinkedList<>();
        push(firstHex);
    }

    @Override
    public void push(BugHex hex) {
        bugStack.addLast(hex);
    }

    @Override
    public BugHex pop() {
        if(!isEmpty()){
            return bugStack.getLast();
        } else {
            return null;
        }
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
