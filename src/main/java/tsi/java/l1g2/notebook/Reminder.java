package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

public class Reminder extends Note {
    private String time;

    @Command
    public String getTime() {
        return time;
    }

    @Command
    public void setTime(@Param(name = "time") String time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        return super.contains(strLow) || time.toLowerCase().contains(strLow);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
