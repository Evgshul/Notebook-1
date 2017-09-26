package tsi.java.l1g2.notebook;

import asg.cliche.Command;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    @Command
    public int getId() {
        return id;
    }

    public abstract boolean contains(String str);

}
