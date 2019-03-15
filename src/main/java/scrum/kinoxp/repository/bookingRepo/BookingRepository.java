package scrum.kinoxp.repository.bookingRepo;


import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Show;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingRepository implements BookingRepo{

    public List<Booking> bookings = new ArrayList<>();

    @Override
    public boolean createBooking(Booking booking) {
        bookings.add(booking);
        return false;
    }

    @Override
    public boolean deleteBooking(int id) {

        int toBeDeleted = -1;
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getId() == id){
                toBeDeleted = i;
                break;
            }
        }
        if (toBeDeleted != -1) {
            bookings.remove(toBeDeleted);
            return true;
        }
        return false;
    }


    @Override
    public boolean updateBooking(Booking booking) {
        int oldMovieIndex = -1;

        for (int i = 0; i < bookings.size(); i++){
            if (booking.getId() == bookings.get(i).getId()) {
                oldMovieIndex = i;
                break;
            }
        }
        if (oldMovieIndex != -1){
            bookings.set(oldMovieIndex, booking);
            return true;
        }
        return false;
    }

    @Override
    public Booking getBooking(int id){
        for (Booking b : bookings) {
            if (b.getId() == id) {
                return b;
            }
        }
        return new Booking();
    }


    @Override
    public List<Booking> getBookings() {
        return bookings;
    }
}
