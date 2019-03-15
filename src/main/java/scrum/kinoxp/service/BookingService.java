package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.repository.bookingRepo.BookingRepo;
import scrum.kinoxp.repository.bookingRepo.BookingRepository;

import java.util.List;

@Service
public class BookingService implements BookingRepo {

    @Autowired
    BookingRepository bookingRepo;


    @Override
    public boolean createBooking(Booking booking) {
        bookingRepo.createBooking(booking);
        return true;
    }

    @Override
    public boolean deleteBooking(int id) {
        bookingRepo.deleteBooking(id);
        return true;
    }

    @Override
    public boolean updateBooking(Booking booking) {
        bookingRepo.updateBooking(booking);
        return true;
    }

    @Override
    public Booking getBooking(int id) {
        return bookingRepo.getBooking(id);
    }

    @Override
    public List<Booking> getBookings() {

        return null;
    }
}
