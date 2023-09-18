package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;
    private final int number;
    private final Collection<Reservation>reservation = new ArrayList<>();

    public int getCounter(){
        return counter;
    }
    public int getNumber() {
        return number;
    }

    {
        number = ++counter;
    }

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    @Override
    public String toString(){
        return String.format(Locale.getDefault(), "Столик #%d", number);
    }
}
