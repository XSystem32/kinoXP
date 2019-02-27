package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.List;

@Repository
public class MovieRepository implements MovieRepo{


    @Override
    public void createMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(int index) {

    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public Movie getMovie(int index) {
        return null;
    }

    @Override
    public List<Movie> getMovies() {
        return null;
    }
}
