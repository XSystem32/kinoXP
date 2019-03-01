package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {


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
    public Movie getMovie(String title) {
        return getMovie(title);
    }

    @Override
    public List<Movie> getMovies() {
        return getMovies();
    }
}
