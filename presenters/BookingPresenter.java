package presenters;
import models.Reservation;
import models.Table;
import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTable(){
        return tableModel.loadTables();
    }
    public void updateTablesUi(){
        bookingView.showTables(loadTable());
    }

    public void updateReservationResultUi(int reservationNumb, boolean flagChangeReservation){
        bookingView.printReservationTableResult(reservationNumb, flagChangeReservation);
    }
    @Override
    public void onResrvationTable(Date orderDate, int tableNumber, String name){
        int reservationNumb = tableModel.reservatinTable(orderDate, tableNumber, name);
        updateReservationResultUi(reservationNumb, false);
    }
    @Override
    public void changeReservationTable(Date orderDate, int tableNumber, String name){
        int reservationNumb = tableModel.changeReservationTable(orderDate, tableNumber, name);
        boolean flagChangeReservation = reservationNumb > 1 ? true: false;
        if(reservationNumb > 0){
            updateReservationResultUi(reservationNumb, flagChangeReservation);
        } else{
            updateReservationResultUi(reservationNumb, flagChangeReservation);
        }

    }

}
