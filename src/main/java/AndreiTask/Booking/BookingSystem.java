package AndreiTask.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    public List<Reservation> bookingStore = new ArrayList<>(); // хранит бронирования

    public List<Reservation> removeReservation(String name, LocalDate date) {
        List<Reservation> removed = bookingStore.stream()
                .filter(r -> r.nameClient().equals(name) && r.date().equals(date))
                .toList();
        bookingStore.removeIf(r -> r.nameClient().equals(name) && r.date().equals(date));
        return removed;
    }

    public boolean checkBookingByName(String nameClient){
        return bookingStore.stream()
                .anyMatch(name -> name.nameClient().equals(nameClient));
    };

    public boolean checkBookingByDate(LocalDate date){
        return bookingStore.stream()
                .anyMatch(d -> d.date().equals(date));
    };

    public Reservation registerBooking(String nameClient, int ticket, LocalDate date){
        for (Reservation r : bookingStore ){
            if (r.nameClient().equals(nameClient)){
                Reservation update = new Reservation(
                        r.nameClient(),r.date(),r.countTicket() + ticket);
                bookingStore.remove(r);
                bookingStore.add(update);
                return update;
            }
        }
        Reservation reservation = new Reservation(nameClient, date, ticket);
        bookingStore.add(reservation);
        return reservation;
}
}




