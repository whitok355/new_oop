package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();

    int reservatinTable(Date reservationDate, int tableNumber, String name);

    int changeReservationTable(Date orderDate, int tableNumber, String name);
}
