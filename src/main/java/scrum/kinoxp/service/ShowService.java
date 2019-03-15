package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.*;
import scrum.kinoxp.repository.bookingRepo.BookingRepo;
import scrum.kinoxp.repository.bookingRepo.BookingRepository;
import scrum.kinoxp.repository.showRepo.ShowRepo;
import scrum.kinoxp.repository.showRepo.ShowRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService implements ShowRepo {

    @Autowired
    ShowRepository showRepo;

    @Autowired
    BookingRepository bookingRepo;

    @Override
    public boolean createShow(Show show) {
        showRepo.createShow(show);
        return true;
    }

    public void repoInit () {
        showRepo.repoInit();
    }

    @Override
    public boolean deleteShow(int index) {
        return false;
    }

    @Override
    public boolean updateShow(Show show) {
        return false;
    }

    @Override
    public Show getShow(int id) {

        Show show = showRepo.getShow(id);
        Theatre theatre = getTheatreById(show.getTheatreId());
        ArrayList<Booking> showBookings = bookingRepo.getBookingsByShowId(show.getId());

        if (!(show.getRows().size() > 0)) {
            show.generateRows(theatre.getAmountOfRows(), theatre.getRowLength());
        }



        return show;
    }

    @Override
    public List<Show> getShows() {
        return showRepo.getShows();
    }

    public Theatre getTheatreById(int id) {
        return showRepo.getTheatreById(id);
    }
}
