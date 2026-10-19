package AndreiTask.Booking;

import java.time.LocalDate;

public record Reservation (String nameClient, LocalDate date,int countTicket) {
    public Reservation{
        if (nameClient == null){
            throw new IllegalArgumentException("Имя не может быть null");
        }
    }

}
