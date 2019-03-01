package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {


    @Override
    public boolean createMovie(Movie movie) {

    }

    @Override
    public boolean deleteMovie(int index) {

    }

    @Override
    public boolean updateMovie(Movie movie) {

    }

    @Override
    public Movie getMovie(int index) {
        return getMovie();
    }

    @Override
    public List<Movie> getMovies() {
        return getMovies();
    }
}
