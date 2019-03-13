package scrum.kinoxp.repository.showRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.*;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShowRepository implements ShowRepo{

    private ArrayList<Show> shows = new ArrayList<>();
    private ArrayList<Theatre> theatres = new ArrayList<>();
    private int lastId = 0;


    public void repoInit() {
        theatres.add(new Theatre(1,20,12)) ;
        theatres.add(new Theatre(2, 25,16));
    }

    @Override
    public boolean createShow(Show show) {
        show.setId(nextId());
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
    public Show getShow(int id) {
        for (Show s : shows) {
            if  (s.getId() == id)
                return s;
        }
        return new Show();
    }

    @Override
    public List<Show> getShows() {
        return shows;
    }

    public ArrayList<Show> getShowsByMovieId(int id) {
        ArrayList<Show> result = new ArrayList<>();

        for (Show s: shows) {
            if (s.getMovieId() == id)
                result.add(s);
        }
        return result;
    }

    public ArrayList<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(ArrayList<Theatre> theatres) {
        this.theatres = theatres;
    }

    public Theatre getTheatreById(int id) {
        for (Theatre t: theatres) {
            if(t.getId() == id)
                return t;
        }
        return new Theatre();
    }

    private int nextId() {
        lastId++;
        return lastId;
    }

}
