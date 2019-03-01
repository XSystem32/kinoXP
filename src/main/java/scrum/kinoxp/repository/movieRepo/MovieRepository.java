package scrum.kinoxp.repository.movieRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {



    public List<Movie> movies = new ArrayList<Movie>();


    @Override
    public boolean createMovie(Movie movie) {

        return false;

    }

    @Override
    public boolean deleteMovie(int index) {

        return false;

    }

    @Override
    public boolean updateMovie(Movie movie) {

        return false;

    }

    @Override
    public Movie getMovie(int index) {
        for (Movie movie : movies) {
            return getMovie(index);
        }
        return null;
    }

    @Override
    public List<Movie> getMovies() {
        return getMovies();
    }
}
