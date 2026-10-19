package AndreiTask.Booking;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        bookingSystem.registerBooking("Данила",1, LocalDate.now());
        bookingSystem.registerBooking("Андрей",2, LocalDate.now());
        System.out.println(bookingSystem.bookingStore);
        bookingSystem.registerBooking("Данила",1, LocalDate.now());
        System.out.println(bookingSystem.bookingStore);
        System.out.println(bookingSystem.checkBookingByName("Данила"));
        bookingSystem.removeReservation("Данила",bookingSystem.bookingStore.getFirst().date());
        System.out.println(bookingSystem.bookingStore);
    }
}
