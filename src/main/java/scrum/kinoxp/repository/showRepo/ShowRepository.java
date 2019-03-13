package scrum.kinoxp.repository.showRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.*;
import scrum.kinoxp.repository.movieRepo.MovieRepo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShowRepository implements ShowRepo{

    ArrayList<Show> shows = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    Movie LOTR = new Movie();
    Movie Hellboy = new Movie();

    public void addShow () {

        Theater bigTheater = new Theater(1,20,12);
        Theater littleTheater = new Theater(2, 25,16);

        shows.add(new Show (1, LOTR, bookings, "12-03-2019", littleTheater));
        shows.add(new Show (2, Hellboy, bookings, "23-06-2019", bigTheater));
    }

    @Override
    public boolean createShow(Show show) {
        shows.add(show);
        return true;
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
    public Show getShow(int index) {
        return null;
    }

    @Override
    public List<Show> getShows() {
        return shows;
    }
}
