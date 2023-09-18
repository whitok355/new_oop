package presenters;
import java.util.Date;

public interface ViewObserver {
    void onResrvationTable(Date orderDate, int tableNumber, String name);

    void changeReservationTable(Date orderDate, int tableNumber, String name);
}
