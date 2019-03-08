package scrum.kinoxp.repository.showRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Seat;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.repository.movieRepo.MovieRepo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShowRepository implements ShowRepo{
    @Autowired
    MovieRepo movieRepo;

    List<Movie> movies = movieRepo.getMovies();

    List<Show> shows = new ArrayList<>();

    public void repoinit(){

        shows.add(new Show(1, new ArrayList<Booking>(), movies.get(1),"210", new ArrayList<Seat>()));
        shows.add(new Show(1, new ArrayList<Booking>(), movies.get(1),"510", new ArrayList<Seat>()));
        shows.add(new Show(1, new ArrayList<Booking>(), movies.get(1),"120", new ArrayList<Seat>()));
    }
    @Override
    public boolean createShow(Show show) {
        return false;
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
        return null;
    }
}
