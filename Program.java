import models.TableModel;
import views.BookingViews;
import presenters.BookingPresenter;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingViews view = new BookingViews();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.updateTablesUi();
        bookingPresenter.onResrvationTable(new Date(), 2, "Ivan");
        bookingPresenter.onResrvationTable(new Date(), 3, "Andrey");
        bookingPresenter.onResrvationTable(new Date(), 4, "Svetlana");
        bookingPresenter.onResrvationTable(new Date(), 1, "OLeg");

        bookingPresenter.updateTablesUi();

        bookingPresenter.changeReservationTable(new Date(), 2, "Ivan");

    }


}
