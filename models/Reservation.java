package models;
import java.util.Date;

public class Reservation {
    public static int counter = 100;
    private final int id;
    {
        id = ++counter;
    }

    private Date date;
    private String name;

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
