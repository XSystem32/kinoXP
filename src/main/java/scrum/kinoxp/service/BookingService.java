package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Row;
import scrum.kinoxp.model.Seat;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.repository.bookingRepo.BookingRepo;
import scrum.kinoxp.repository.bookingRepo.BookingRepository;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService implements BookingRepo {

    @Autowired
    BookingRepository bookingRepo;

    @Autowired
    ShowService showService;


    @Override
    public boolean createBooking(Booking booking) {
        Show show = showService.getShow(booking.getShowId());
        List<String> seatsTaken = booking.getSeats();

        for (String takenSeat : seatsTaken) {
            int current = Integer.parseInt(takenSeat);

            for (Row row: show.getRows()) {
                for (Seat seat : row.getSeats()) {
                    if (seat.getId() == current) {
                        seat.setTaken(true);
                    }
                }
            }
        }



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
