package hive.model;

import hive.structure.BugType;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Hive hive = new Hive();
        BugHex testHex = new BugHex(BugType.BEETLE, Color.black);

        hive.addHex(testHex, 0, 0);

        hive.printHive();

    }

}
