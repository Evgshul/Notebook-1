package tsi.java.l1g2.notebook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Note implements Expirable {
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
    private LocalDateTime time;

    public String getTimeAsString() {
        LocalDateTime dt = getTime();
        return dt.format(formatter);
    }

    public void setTimeAsString(String str) {
        LocalDateTime dt = LocalDateTime.parse(str, formatter);
        setTime(dt);
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        return super.contains(strLow)
                || getTimeAsString().toLowerCase().contains(strLow);
    }

    @Override
    public boolean isExpired() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(time);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + getTimeAsString() + '\'' +
                '}';
    }
}
