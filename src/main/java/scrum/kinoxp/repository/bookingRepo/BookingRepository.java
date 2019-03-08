package scrum.kinoxp.repository.bookingRepo;


import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Show;

import java.util.List;

@Repository
public class BookingRepository implements BookingRepo{

    @Override
    public boolean createBooking(Booking booking) {
        return false;
    }

    @Override
    public boolean deleteBooking(int index) {
        return false;
    }

    @Override
    public boolean updateBooking(Booking booking) {
        return false;
    }

    @Override
    public Booking getBooking(int index) {
        return null;
    }

    @Override
    public List<Booking> getBookings() {
        return null;
    }
}
