package presenters;

import models.Table;

import java.util.Collection;

public interface View {
    void showTables(Collection<Table> tables);

    void printReservationTableResult(int reservationId, boolean flagChangeReservation);

    void setObserver(ViewObserver observer);
}
