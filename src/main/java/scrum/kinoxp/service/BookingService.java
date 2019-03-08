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
