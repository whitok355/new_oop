package views;
import models.Table;
import presenters.View;
import presenters.ViewObserver;
import java.util.Collection;
import java.util.Date;
public class BookingViews implements View {

    private ViewObserver observer;
    public void showTables(Collection<Table> tables){
        for(Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }
    @Override
    public void printReservationTableResult(int reservationNumb, boolean flagChangeReservation){
        if(reservationNumb > 0) {
            if(flagChangeReservation){
                System.out.printf("В бронь #%d внесены изменения\n ", reservationNumb);
            } else{
                System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNumb);
            }
        } else{
            System.out.println("Не удалось забронировать столик. Попробуйте выполнить операцию позже.");
        }
    }

    public void changeReservationTable(Date orderDate, int tableNumber, String name){
        observer.changeReservationTable(orderDate, tableNumber, name);
    }
    public void reservationTable(Date dateRes, int numTable, String name){
        observer.onResrvationTable(dateRes, numTable, name);
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){}
}
