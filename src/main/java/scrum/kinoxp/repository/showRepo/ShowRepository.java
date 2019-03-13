package scrum.kinoxp.repository.showRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.*;
import scrum.kinoxp.repository.movieRepo.MovieRepo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShowRepository implements ShowRepo{

    private ArrayList<Show> shows = new ArrayList<>();
    private ArrayList<Theater> theaters = new ArrayList<>();
    private int lastId = 0;


    public void repoInit() {
        theaters.add(new Theater(1,20,12)) ;
        theaters.add(new Theater(2, 25,16));
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
    public Show getShow(int index) {
        return null;
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

    public ArrayList<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(ArrayList<Theater> theaters) {
        this.theaters = theaters;
    }

    private int nextId() {
        lastId++;
        return lastId;
    }
}
