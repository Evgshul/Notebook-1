package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

public class Alarm extends Note implements Expirable {
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
    public boolean isExpired() {
        return false;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
