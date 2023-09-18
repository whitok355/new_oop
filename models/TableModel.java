package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if(tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     *
     * @param reservationDate дата
     * @param name имя клиента
     * @return возвращает номер бронирования
     */
    public int reservatinTable(Date reservationDate,int tableNumber, String name){
        for(Table table: loadTables()){
            if(table.getNumber() == tableNumber){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int changeReservationTable(Date orderDate, int tableNumber, String name){
        for(Table table: loadTables()){
            if(table.getNumber() == tableNumber){
                for(Reservation reservation: table.getReservation()){
                    reservation.setDate(new Date(1212121212121L));
                    return reservation.getId();
                }
            }
        }
        return -1;
    }
}
