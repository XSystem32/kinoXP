package scrum.kinoxp.repository.bookingRepo;


import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Booking;


import java.util.List;

@Repository
public interface BookingRepo{

    public boolean createBooking (Booking booking);
    public boolean deleteBooking (int index);
    public boolean updateBooking (Booking booking);
    Booking getBooking (int index);
    List<Booking> getBookings();

}
